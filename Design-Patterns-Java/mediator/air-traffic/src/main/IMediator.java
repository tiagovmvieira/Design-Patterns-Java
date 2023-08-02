package main;

public interface IMediator {

    public void addUser(User user);
    public void sendMessage(String message, User sender);
}
