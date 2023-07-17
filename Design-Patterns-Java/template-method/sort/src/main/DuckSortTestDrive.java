package main;

import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args){

        DuckSort[] ducks = {
            new DuckSort("Daffy", 8),
            new DuckSort("Dewey", 2),
            new DuckSort("Howard", 7),
            new DuckSort("Louie", 2),
            new DuckSort("Donald", 10),
            new DuckSort("Huey", 2)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting");
        display(ducks);

    }

    public static void display(DuckSort[] ducks){

        for(DuckSort d: ducks){
            System.out.println(d);
        }

    }

}
