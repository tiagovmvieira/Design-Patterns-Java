package main;

import java.util.ArrayList;

public class MediatorAirTraffic implements IMediator{
    private ArrayList<User> users;

    public MediatorAirTraffic(){

        users = new ArrayList<User>();
    }

    @Override
    public void addUser(User user) {

        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for(int i = 0; i < users.size(); i++){
            if (users.get(i) != sender){
                users.get(i).receiveMessage(message, sender);
            }
        }
    }
}
