package com.stephen.learning.algorithm.cache;

import org.junit.Test;


/**
 * @Auther: jack
 * @Date: 2018/10/23 15:27
 * @Description:
 */
public class TestCache {

    @Test
    public void test() {
        LRUCache<Integer, Integer> cache = new LRUCacheImpl2<Integer, Integer>(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(1));

        String str="123";
        System.out.println(str.substring(0,1));
    }
}
