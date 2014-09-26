package org.ehcache;

import org.ehcache.internal.store.OnHeapStore;
import org.ehcache.spi.cache.Store;
import org.ehcache.spi.test.StoreFactory;
import org.ehcache.spi.test.StoreTester;
import org.junit.Test;

/**
 * @author Hung Huynh
 */
public class OnHeapStoreTest {

  @Test
  public void test() throws Exception {
    StoreTester tester = new StoreTester(new StoreFactory() {
      @Override
      public <K, V> Store<K, V> newStore(final Class<K> keyType, final Class<V> valueType) {
        return new OnHeapStore<K, V>();
      }
    });
    tester.runTestSuite().reportAndThrow();
  }

}