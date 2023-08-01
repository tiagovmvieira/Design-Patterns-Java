package main;

import java.util.Objects;

public class SpamHandler implements Handler{
    private Handler sucessor;
    @Override
    public void setNextHandler(Handler nextHandler) {

        this.sucessor = nextHandler;
    }

    @Override
    public void handleRequest(Email request) {
        if(Objects.equals(request.getEmailRequest(), "spam")){
            System.out.println("Going to delete the referred spam e-mail");
        } else {
            sucessor.handleRequest(request);
        }
    }

}
