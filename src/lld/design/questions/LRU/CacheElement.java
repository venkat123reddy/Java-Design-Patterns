package lld.design.questions.LRU;

public class CacheElement {

    int key;
    int value;
    CacheElement previous;
    CacheElement next;

    CacheElement(int key, int value) {

        this.key = key;
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
