package com.stephen.learning.algorithm.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther: jack
 * @Date: 2018/10/23 16:40
 * @Description: 使用LinkedHashMap实现
 * 1.accessOrder设置为true表示按照顺序进行删除，不是按照默认的插入顺序删除；
 * 2.removeEldestEntry重写只要超出capacity大小就触发LRU删除操作
 */
public class LRUCacheImpl2<K, V> implements LRUCache<K, V> {
    private static final float mapLoadFactor = 0.75f;
    private LinkedHashMap<K, V> map;
    private int capacity;

    public LRUCacheImpl2(int capacity) {
        this.capacity = capacity;
        int mapInitialCapacity = (int) Math.ceil(capacity / mapLoadFactor) + 1;
        this.map = new LinkedHashMap<K, V>(mapInitialCapacity, mapLoadFactor, true) {
            private static final long serialVersionUID = 1L;

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return this.size() > LRUCacheImpl2.this.capacity;
            }
        };
    }

    public V get(K key) {
        return this.map.containsKey(key) ? this.map.get(key) : null;
    }

    public void put(K key, V value) {
        this.map.put(key, value);
    }
}
