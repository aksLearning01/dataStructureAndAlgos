package edu.aks.learning.ds.list;

public class CircularLinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {

        //if the list is empty
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            //if fist element insertion
            Node newNode = new Node(data);
            //tail will point to new node
            tail.next = newNode;
            //tail will become new node
            tail = newNode;
            tail.next = head;

        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node temp = head;
            if (temp.next == null) {
                System.out.print(" " + temp.data);
            }
            if (head == tail) {
                System.out.print(" " + head.data);
            } else {
                System.out.print("" + temp.data);
                while (temp.next != tail) {
                    System.out.print(" " + temp.next.data);
                    temp = temp.next;
                }
                System.out.print(" " + tail.data);
            }
        }
    }

    public void remove() {
        Node currNode = head;
        while (currNode.next != tail) {
            currNode = currNode.next;
        }

        currNode.next = head;
        tail = currNode;

    }

    public void removeSpec(int data) {
        Node curr = head;

        //if the element to remove is present at the first place
        if (curr.data == data) {
            head = curr.next;
        }


        while (curr.next != tail) {
            //remove specific node with first occurrence of the value
            if (curr.next.data == data) {
                Node temp = curr.next;
                curr.next = temp.next;
            }
            curr = curr.next;
        }

        //if the last element is the specific element to remove
        if (tail.data == data) {
            curr.next = head;
            tail = curr;
        }

    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        System.out.println("");
        list.removeSpec(1);
        list.display();
        System.out.println("");
    }


}

