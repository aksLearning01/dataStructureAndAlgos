package edu.aks.learning.ds.list;

public class DoublyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        //If the list is empty
        if (head == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next = null;

    }


    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node curr = head;
        if (head.next == null) {
            System.out.println(curr.data);
            return;
        }
        while (curr.next != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.print(" " + curr.data);
    }

    public void removeFromEnd() {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        Node prevNode = currNode.prev;
        prevNode.next = null;

    }

    public void removeFromStart() {
        Node currNode = head;
        currNode.next.prev = null;
        head = currNode.next;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(2);
        dll.push(3);
        dll.push(4);
        dll.insertAfter(dll.head.next, 8);
        dll.append(5);
        dll.display();
        System.out.println("");
        dll.removeFromEnd();
        dll.display();
        dll.removeFromStart();
        System.out.println("");
        dll.display();
    }
}
