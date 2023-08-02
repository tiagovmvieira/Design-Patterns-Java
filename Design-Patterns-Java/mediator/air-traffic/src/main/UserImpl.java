package main;

public class UserImpl extends User{

    public UserImpl(IMediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {

        System.out.println("Message sent " + message + " by " + this.getName());
        getMediator().sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, User sender) {

        System.out.println("Message received " + message + " by " + this.getName() + " from " + sender.getName());
    }
}
