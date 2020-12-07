package edu.ask.learning.ds.list;


import edu.aks.learning.ds.list.LinkedList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    private static LinkedList ll;
    private static LinkedList ll1;

    @BeforeAll
    public static void before() {
        ll = new LinkedList();
        ll1 = new LinkedList();
        ll1.insert(4);
    }

    @Test
    void givenListIsEmpty_testIsEmpty() {
        assertEquals(true, ll.isEmpty());
    }

    @Test
    void givenListIsEmpty_testInsertIntoLinkedList() {
        ll.insert(2);
        assertEquals(1, ll.length());
    }

    @Test
    void givenListIsNotEmpty_testInsertIntoLinkedList() {
        ll1.insert(6);
        assertEquals(2, ll1.length());
    }

    @Test
    void givenListIsNotEmpty_testInsertAtStart() {
        ll1.insertAtStart(8);
        assertEquals(3, ll1.length());
    }


    @Test
    void givenListIsNotEmpty_testRemove() {
        ll1.removeFirst();
        assertEquals(2, ll1.length());
    }

}
