package lld.design.questions.LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public int cacheCapacity;

    public Map<Integer,CacheElement> LRUCache;

    public CacheElement evictionElementHead;
    public CacheElement evictionElementTail;

    LRUCache(int cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
        this.LRUCache = new HashMap<>(cacheCapacity);
        this.evictionElementHead = null;
        this.evictionElementTail = null;
    }

    public Integer get(int key) {

        if(this.LRUCache.containsKey(key)) {
            return this.LRUCache.get(key).value;
        }
        return -1;
    }

    private void evictElement() {

        this.evictionElementHead = this.evictionElementHead.next;
        this.evictionElementHead.previous = null;

    }

    private void updateEviction(CacheElement cacheElement) {


    }

    private void addEviction(CacheElement cacheElement) {

    }


    public void put(int key, int value) {

        if (this.LRUCache.containsKey(key)) {

        }
        if (this.LRUCache.size() == this.cacheCapacity) {

            evictElement();
        }
    }






}
