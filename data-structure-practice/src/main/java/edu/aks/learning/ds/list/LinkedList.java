package edu.aks.learning.ds.list;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void insert(int data) {

        Node newNode = new Node(data);
        //if the list is empty , insert first element
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void insertAtStart(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        Node newNode = new Node(data);
        head = newNode;
        head.next = curr;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Deleted single element from the list");
            return;
        }

        Node currNode = head;
        head = currNode.next;
    }

    public void display() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curr.next != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.print(" " + curr.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
        System.out.println("Element at head" + list.head.data);
        System.out.println("");
        list.removeFirst();
        list.display();
        System.out.println("Element at head" + list.head.data);
        list.insertAtStart(5);
        list.display();
        System.out.println("Element at head" + list.head.data);
        System.out.println("");
    }

}