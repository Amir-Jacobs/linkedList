package com.company;

public class List {
    private Node first;
    private Node last;

    // addFirst
    public void addFirst(String value) {
        Node node = new Node(value);

        if (this.first == null) this.first = this.last = node;
        else {
            node.next = this.first;
            this.first = node;
        }
    }

    // addLast
    public void addLast(String value) {
        Node node = new Node(value);

        if (this.last == null) this.first = this.last = node;
        else {
            this.last.next = node;
            this.last = node;
        }
    }

    // deleteFirst
    public void deleteFirst() {
        Node reference = this.first;

        this.first = this.first.next;
        reference.next = null;
    }

    // deleteLast
    public void deleteLast() {
        if (this.first == null) return;

        Node secondLast = this.first.getSecondLast(this.last);
        secondLast.next = null;
        this.last = null;
    }

    // contains
    public boolean contains(String value) {
        if (this.first != null)
            return this.first.contains(value);

        return false;
    }

    // indexOf
    public int indexOf(String value) {
        if (this.first != null)
            return this.first.indexOf(value, 0);

        return -1;
    }

    // toString
    @Override
    public String toString() {
        return String.format("[%s]", this.first != null ? this.first.toString() : "");
    }
}
