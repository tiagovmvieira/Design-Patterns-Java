package main;

public class TestCloning {

    public static void main(String[] args){

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Dog bobby = new Dog();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        Dog clonedDog = (Dog) animalMaker.getClone(bobby);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println(bobby);
        System.out.println(clonedDog);

        System.out.println("Sally Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Cloned Sheep Hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));

        System.out.println("Bobby Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Cloned Dog Hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}
