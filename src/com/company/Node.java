package com.company;

public class Node implements Cloneable {
    public Node next;
    public String value;

    public Node(String value) {
        this.value = value;
    }

    public Node getSecondLast(Node node) {
        return this.next != null ? this.next.equals(node) ? this : this.next.getSecondLast(node) : null;
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.next != null ? this.value + ", " : this.value, this.next != null ? this.next.toString() : "");
    }

    public boolean contains(String value) {
        return this.value.equals(value) || (this.next != null && this.next.contains(value));
    }

    public int indexOf(String value, int index) {
        return this.value.equals(value) ? index : this.next != null ? this.next.indexOf(value, (index + 1)) : -1;
    }

    public int size(int i) {
        return this.next != null ? this.next.size(++i) : i;
    }
}
