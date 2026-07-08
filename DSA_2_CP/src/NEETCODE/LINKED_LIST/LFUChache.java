//package NEETCODE.LINKED_LIST;
//
//public class LFUChache {
//    public LFUChache(int maxSizeCache, Map<Integer, Node> keyNodeMap, Map<Integer, DoubleLinkedList> freqListMap) {
//        this.maxSizeCache = maxSizeCache;
//        this.keyNodeMap = keyNodeMap;
//        this.freqListMap = freqListMap;
//    }
//
//    // 1. Inner Node Class
//    private class Node {
//        int key, value, cnt;
//        Node next, prev;
//
//        Node(int key, int value) {
//            this.key = key;
//            this.value = value;
//            this.cnt = 1; // Initial frequency is 1 upon insertion
//        }
//    }
//
//    // 2. Inner Doubly Linked List Class
//    private class DoubleLinkedList {
//        Node head, tail;
//        int size;
//
//        DoubleLinkedList() {
//            head = new Node(-1, -1);
//            tail = new Node(-1, -1);
//            head.next = tail;
//            tail.prev = head;
//            size = 0;
//        }
//
//        void addFront(Node node) {
//            Node temp = head.next;
//            node.next = temp;
//            node.prev = head;
//            head.next = node;
//            temp.prev = node;
//            size++;
//        }
//
//        void removeNode(Node node) {
//            Node nextNode = node.next;
//            Node prevNode = node.prev;
//            prevNode.next = nextNode;
//            nextNode.prev = prevNode;
//            size--;
//        }
//
//        Node removeTail() {
//            if (size > 0) {
//                Node lruNode = tail.prev;
//                removeNode(lruNode);
//                return lruNode;
//            }
//            return null;
//        }
//    }
//
//    // Class level instance variables (Fixes the "cannot find symbol" errors)
//    private final int maxSizeCache;
//    private int currentSize;
//    private int minFreq;
//    private final Map<Integer, Node> keyNodeMap;
//    private final Map<Integer, DoubleLinkedList> freqListMap;
//
//    public LFUCache(int capacity) {
//        this.maxSizeCache = capacity;
//        this.currentSize = 0;
//        this.minFreq = 0;
//        this.keyNodeMap = new HashMap<>();
//        this.freqListMap = new HashMap<>();
//    }
//
//    public int get(int key) {
//        if (!keyNodeMap.containsKey(key)) {
//            return -1;
//        }
//        Node node = keyNodeMap.get(key);
//        updateFrequency(node);
//        return node.value;
//    }
//
//    public void put(int key, int value) {
//        if (maxSizeCache == 0) return;
//
//        if (keyNodeMap.containsKey(key)) {
//            Node node = keyNodeMap.get(key);
//            node.value = value; // Update value
//            updateFrequency(node);
//        } else {
//            // Evict if cache is at max capacity
//            if (currentSize == maxSizeCache) {
//                DoubleLinkedList minFreqList = freqListMap.get(minFreq);
//                Node deletedNode = minFreqList.removeTail();
//                keyNodeMap.remove(deletedNode.key);
//                currentSize--;
//            }
//
//            // Insert new node
//            Node newNode = new Node(key, value);
//            minFreq = 1; // Reset minFreq to 1 for the freshly added item
//
//            DoubleLinkedList curList = freqListMap.getOrDefault(minFreq, new DoubleLinkedList());
//            curList.addFront(newNode);
//            freqListMap.put(minFreq, curList);
//            keyNodeMap.put(key, newNode);
//            currentSize++;
//        }
//    }
//
//    // Helper method to upgrade frequency of an existing node in O(1)
//    private void updateFrequency(Node node) {
//        int oldFreq = node.cnt;
//        DoubleLinkedList oldList = freqListMap.get(oldFreq);
//        oldList.removeNode(node);
//
//        // If the current minFreq list becomes empty, increment global minFreq
//        if (oldFreq == minFreq && oldList.size == 0) {
//            minFreq++;
//        }
//
//        node.cnt++;
//        int newFreq = node.cnt;
//        DoubleLinkedList newList = freqListMap.getOrDefault(newFreq, new DoubleLinkedList());
//        newList.addFront(node);
//        freqListMap.put(newFreq, newList);
//    }
//}
