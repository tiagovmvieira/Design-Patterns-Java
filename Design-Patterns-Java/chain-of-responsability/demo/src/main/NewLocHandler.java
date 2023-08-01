package main;

import java.util.Objects;

public class NewLocHandler implements Handler{
    private Handler successor;
    @Override
    public void setNextHandler(Handler nextHandler) {

        this.successor = nextHandler;
    }

    @Override
    public void handleRequest(Email request) {
        if(Objects.equals(request.getEmailRequest(), "newLocation")){
            System.out.println("Going to forward the referred new location e-mail to the business development");
        } else {
            System.out.println("Only works for spam, fan, complaint and newLocation e-mails!");
        }
    }

}
