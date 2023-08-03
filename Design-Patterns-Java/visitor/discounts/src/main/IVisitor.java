package main;

public interface IVisitor {

    public double visitor(CricketBall cricketBall);
    public double visitor(CricketBat cricketBat);
    public double visitor(VolleyBall volleyBall);

}
