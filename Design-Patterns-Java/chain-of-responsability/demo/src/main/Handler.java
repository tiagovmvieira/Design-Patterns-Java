package main;

public interface Handler {

    public void setNextHandler(Handler nextHandler);

    public void handleRequest(Email request);
}
