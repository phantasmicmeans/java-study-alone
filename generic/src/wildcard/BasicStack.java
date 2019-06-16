package src.wildcard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public BasicStack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    public void push(E o) {
        ensureCapacity();
        elements[size] = o;
        size ++;
    }

    public E pop() {
        if(size > 0) {
            size --;
            E o = elements[size];
            elements[size] = null;
            return o;
        }
        return null;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }else
            return false;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public String print() {
        String s = "";
        for(E e : elements) {
            s = s + (Integer) e + ", ";
        }
        return s;
    }

    public static Set incorrectUnion(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E> (s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> unionWildCard(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E>result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
}