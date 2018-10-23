package com.stephen.learning.algorithm.cache;

/**
 * @Auther: jack
 * @Date: 2018/10/23 15:04
 * @Description: 实现最近最少使用算法
 */
public interface LRUCache<K,V> {
    /**
     * 获取值
     * @param key
     * @return
     */
    V get(K key);

    /**
     * 设置键值
     * @param key
     * @param value
     */
    void put(K key,V value);
}
