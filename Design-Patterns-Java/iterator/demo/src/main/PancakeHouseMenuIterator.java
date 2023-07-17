package main;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){

        this.items = items;
    }

    @Override
    public boolean hasNext() {

        return items.size() > position;
    }

    @Override
    public MenuItem next() {

        return items.get(position++);
    }

}
