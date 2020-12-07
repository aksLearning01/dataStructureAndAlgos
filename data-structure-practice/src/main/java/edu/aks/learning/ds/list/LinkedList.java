package edu.aks.learning.ds.list;

public class LinkedList {
    public Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return length() == 0;
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
        System.out.println("");
    }

    public int length() {
        int size = 0;
        Node currNode = head;
        if (head != null) {
            while (currNode.next != null) {
                size++;
                currNode = currNode.next;
            }
            size++;
        }
        return size;
    }

    public LinkedList reverse() {
        int size = length();
        LinkedList ll = new LinkedList();
        Node currNode = head;
        while (currNode.next != null) {
            ll.insertAtStart(currNode.data);
            currNode = currNode.next;
        }
        ll.insertAtStart(currNode.data);
        return ll;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
        System.out.println("Element at head is : " + list.head.data);
        list.removeFirst();
        list.display();

        System.out.println("Element at head is : " + list.head.data);
        list.insertAtStart(5);
        list.display();
        System.out.println("Element at head is : " + list.head.data);
        list.display();
        System.out.println("Reversed List is : ");
        (list.reverse()).display();
    }
}