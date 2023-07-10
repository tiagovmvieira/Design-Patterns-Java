package main;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestDrive {

    public static void main(String[] args){

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        Enumeration<String> enumeration = vector.elements();
        EnumerationIteratorAdapter adapter = new EnumerationIteratorAdapter(enumeration);

        testIterator(adapter);

    }

    public static void testIterator(Iterator<Object> adapter){

        while (adapter.hasNext()){
            Object element = adapter.next();
            System.out.println(element);
        }

    }

}
