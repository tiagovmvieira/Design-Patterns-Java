package main;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator<Object>{
    Enumeration<?> enumeration;

    public EnumerationIteratorAdapter(Enumeration<?> enumeration){

        this.enumeration = enumeration;
    }

    public boolean hasNext(){

        return enumeration.hasMoreElements();
    }

    public Object next(){

        return enumeration.nextElement();
    }

    public void remove(){

        throw new UnsupportedOperationException();
    }

}
