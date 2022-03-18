// JAB (Jeffery Tang, Andrew Piatetsky, Brian Kang)
// APCS pd6
// HW79: A YouTube Host Are You
// 2022-03-17
// time spent:  30mins

/*
Q
Why does pass by reference not happen when I set a new instance of Node to an already existing node. Is it something to do with the fact
that each node is defined by the pervious one?
What uses are there for linked lists? I can't really think of any because to get to the last element it seems like such a hassle.
C/C
*/
/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class DLNode {

    // instance variables:
    private String _value;
    private DLNode _next;
    private DLNode _prev;

    // overloaded constructor - no more nodes attached
    public DLNode ( String val ) {
        _value = val;
        _next = null;
        _prev = null;
    }

    // overloaded constructor - node connects to another node
    public DLNode( String val, DLNode next ) {
        this(val);
        _next = next;
    }


    // overloaded constructor - node connects to another node, and connects backwards to a specified node
    public DLNode( String val, DLNode next, DLNode prev ) {
        this(val, next);
        _prev = prev;
    }



    // ACCESSORS

    // returns the value stored inside the node
    public String getCargo() {
        return _value;
    }

    // returns the next node
    public DLNode getNext() {
        return _next;
    }

    // returns the previous node
    public DLNode getPrevious() {
        return _prev;
    }


    // MUTATORS

    // sets cargo to the specified value
    public String setCargo ( String newVal ) {
        String oldVal = _value;
        _value = newVal;
        return oldVal;
    }

    // sets next node to specified value
    public DLNode setNext (DLNode next) {
        DLNode oldVal = _next;
        _next = next;
        return oldVal;
    }

    // sets the previous node to arg
    public DLNode setPrevious ( DLNode prev) {
        DLNode oldVal = _prev;
        _prev = prev;
        return oldVal;
    }

    // overrides toString method
    public String toString() {
        // String str = _value + " --> " + _next;
        String str = _value;
        return str;
    }


    public static void main(String[] args) {

        DLNode first = new DLNode("cat");

        first.setNext(new DLNode("dog"));

        first.getNext().setNext(new DLNode("cow"));

        System.out.println(first);


        // when you do this (using first itself as the next node) it basically shortens the linked list each time
        // while (first != null) {
        //     System.out.println(first);
        //     System.out.println(first.getCargo());
        //     first = first.getNext();
        // }



        // better way is to use new variable that is not attached to the starting node
        DLNode next = first;


        while (next != null) {
            System.out.println(next.getCargo());
            next = next.getNext();
        }
    }










}
