package main;

public class TestHandlerChain {

    public static void main(String[] args){

        Handler spamHandler = new SpamHandler();
        Handler fanHandler = new FanHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler newLocHandler = new NewLocHandler();

        spamHandler.setNextHandler(fanHandler);
        fanHandler.setNextHandler(complaintHandler);
        complaintHandler.setNextHandler(newLocHandler);

        Email spamEmail = new Email("spam");
        Email fanEmail = new Email("fan");
        Email complaintEmail = new Email("complaint");
        Email newLocEmail = new Email("newLocation");
        Email magicEmail = new Email("magic");

        spamHandler.handleRequest(spamEmail);
        spamHandler.handleRequest(fanEmail);
        spamHandler.handleRequest(complaintEmail);
        spamHandler.handleRequest(newLocEmail);
        spamHandler.handleRequest(magicEmail);
    }

}
