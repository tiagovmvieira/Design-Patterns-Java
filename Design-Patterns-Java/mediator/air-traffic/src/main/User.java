package main;

public abstract class User {
    private IMediator mediator;
    private String name;

    public User(IMediator mediator, String name){

        this.mediator = mediator;
        this.name = name;
    }

    public IMediator getMediator(){ return mediator; }
    public String getName(){ return name; }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message, User sender);

}
