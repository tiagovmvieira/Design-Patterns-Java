package main;

public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey theTurkey){

        this.turkey = theTurkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {

        for(int i = 0; i < 5; i++){
            turkey.fly();
        }

    }

}
