package myDataStructure;

import java.util.NoSuchElementException;

public class MyLinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;




    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public int size(){
        return size;
    }

    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last){
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node last) {
        var current = first;
        while (current != null){
            if (current.next == last) return current;
            current = current.next;
        }

        return null;
    }


    public void removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last){
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }


    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void addFirst( int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast( int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void print(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public boolean isEmpty(){
        return first == null;
    }

}
