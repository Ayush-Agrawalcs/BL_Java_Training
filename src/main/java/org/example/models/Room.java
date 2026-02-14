package org.example.models;

public class Room {
    private RoomType room;
    private double price;
    private boolean avilable=true;

    public Room(RoomType room, double price){
        this.room=room;
        this.price=price;
    }

    public RoomType getRoom() {
        return room;
    }

    public double getPrice(){
        return price;
    }

    public  boolean isAvilable(){
        return avilable;
    }

    public void setAvilable(boolean avilable) {
        this.avilable = avilable;
    }
}
