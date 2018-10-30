package com.stephen.learning.algorithm.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Auther: jack
 * @Date: 2018/10/23 15:09
 * @Description: 使用Map和LinkedList实现
 */
public class LRUCacheImpl<K,V> implements LRUCache<K,V> {
    private final int capacity;
    private final Map<K,V> keyValue;
    private final LinkedList<K> cache;

    LRUCacheImpl(int capacity){
        this.capacity=capacity;
        this.keyValue=new HashMap<K, V>(capacity);
        this.cache=new LinkedList<K>();
    }

    public V get(K key) {
        if(this.keyValue.containsKey(key)){
            if(this.cache.peekFirst()!=key){
                this.cache.removeFirstOccurrence(key);
                this.cache.addFirst(key);
            }
        }
        return this.keyValue.get(key);
    }

    public void put(K key, V value) {
        this.keyValue.put(key,value);
        if(this.keyValue.containsKey(key)){
            if(this.cache.peekFirst()==key){
                return;
            }
            this.cache.removeFirstOccurrence(key);
        }else{
            if(this.cache.size()==capacity){
                this.keyValue.remove(this.cache.removeLast());
            }
        }
        this.cache.addFirst(key);
    }
}
