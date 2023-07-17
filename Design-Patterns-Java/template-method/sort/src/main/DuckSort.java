package main;

public class DuckSort implements Comparable<DuckSort>{

    String name;
    int weight;

    public DuckSort(String name, int weight){

        this.name = name;
        this.weight = weight;
    }

    public String toString(){

        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(DuckSort otherDuck) {

        if (this.weight < otherDuck.weight){
            return -1;
        } else if (this.weight == otherDuck.weight){
            return 0;
        } else{
            return 1;
        }

    }

}
