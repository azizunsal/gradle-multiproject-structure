package com.aunsal.gradle.list;

public class LinkedList {
    Node head;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class Node {
        final int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
