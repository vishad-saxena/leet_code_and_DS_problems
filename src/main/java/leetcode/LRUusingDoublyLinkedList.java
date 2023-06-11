package leetcode;

import java.util.HashMap;

public class LRUusingDoublyLinkedList {
    Node headNode=new Node(0,0);
    Node tailNode=new Node(0,0);
    int capacity;

    LRUusingDoublyLinkedList(int capacity){
        this.capacity=capacity;
        headNode.next=tailNode;
        tailNode.prev=headNode;
    }
    HashMap<Integer,Node> map=new HashMap<>(capacity);
    class Node{
        int val;
        int key;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public static void main(String[] args) {
        LRUusingDoublyLinkedList lruCache=new LRUusingDoublyLinkedList(2);
        lruCache.put(1,12);
        lruCache.put(2,22);
        System.out.println(lruCache.get(1));
        lruCache.put(3,32);
        lruCache.put(4,42);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
    }

    private int get(int key) {
        if (map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else {
            return -1;
        }
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void put(int key, int val) {
        if (map.containsKey(key)){
            remove(map.get(key));
        } else if (map.size()==capacity) {
            remove(tailNode.prev);
        }
        insert(new Node(key,val));
    }

    private void insert(Node node) {
        map.put(node.key,node);
        Node headNext=headNode.next;
        headNode.next=node;
        node.prev=headNode;
        node.next=headNext;
        headNext.prev=node;

    }
}













//Node headNode=new Node(0,0);
//    Node tailNode=new Node(0,0);
//    int capacity;
//    HashMap<Integer,Node> map=new HashMap<>(capacity);
//    LRUusingDoublyLinkedList(int capacity){
//        this.capacity=capacity;
//        headNode.next=tailNode;
//        tailNode.prev=headNode;
//    }
//
//    public static void main(String[] args) {
//        LRUusingDoublyLinkedList lruCache=new LRUusingDoublyLinkedList(2);
//        lruCache.put(1,12);
//        lruCache.put(2,22);
//        System.out.println(lruCache.get(1));
//        lruCache.put(3,32);
//        System.out.println(lruCache.get(2));
//    }
//
//    private int get(int key) {
//        if(map.containsKey(key)){
//            Node node= map.get(key);
//            removeNode(node);
//            insert(node);
//            return node.val;
//        }
//        else {
//            return -1;
//        }
//    }
//
//    private void put(int key, int value) {
//        if(map.containsKey(key)){
//            removeNode(map.get(key));
//        }
//        if (map.size()==capacity){
//            removeNode(tailNode.prev);
//        }
//        insert(new Node(key,value));
//    }
//
//    private void insert(Node node) {
//        map.put(node.key, node);
//        Node headNext=headNode.next;
//        headNode.next=node;
//        node.prev=headNode;
//        headNext.prev=node;
//        node.next=headNext;
//    }
//
//    private void removeNode(Node ref) {
//        map.remove(ref.key);
//        ref.prev.next=ref.next;
//        ref.next.prev=ref.prev;
//    }
//
//    class Node{
//        Node prev;
//        Node next;
//        int key;
//        int val;
//        Node(int key,int val){
//            this.val= val;
//            this.key=key;
//
//        }
//    }