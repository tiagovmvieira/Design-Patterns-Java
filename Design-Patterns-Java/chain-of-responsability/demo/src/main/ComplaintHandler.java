package main;

import java.util.Objects;

public class ComplaintHandler implements Handler{
    private Handler successor;
    @Override
    public void setNextHandler(Handler nextHandler) {

        this.successor = nextHandler;
    }

    @Override
    public void handleRequest(Email request) {
        if(Objects.equals(request.getEmailRequest(), "complaint")){
            System.out.println("Going to forward the referred complaint e-mail to the legal department");
        } else {
            successor.handleRequest(request);
        }
    }

}
