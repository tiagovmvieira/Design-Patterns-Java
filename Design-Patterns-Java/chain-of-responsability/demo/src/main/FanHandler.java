package main;

import java.util.Objects;

public class FanHandler implements Handler{
    private Handler successor;
    @Override
    public void setNextHandler(Handler nextHandler) {

        this.successor = nextHandler;
    }

    @Override
    public void handleRequest(Email request) {
        if(Objects.equals(request.getEmailRequest(), "fan")){
            System.out.println("Going to forward the referred fan e-mail to the CEO");
        } else {
            successor.handleRequest(request);
        }
    }

}
