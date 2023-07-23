package main;

import java.util.ArrayList;

public class MenuComposite extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public MenuComposite(String name, String description){

        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){

        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){

        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int index){

        return menuComponents.get(index);
    }

    public String getName(){

        return name;
    }

    public String getDescription(){

        return description;
    }

    public void print(){

        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents){
            menuComponent.print();
        }

    }
}
