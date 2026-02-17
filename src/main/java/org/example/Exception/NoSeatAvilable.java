package org.example.Exception;

public class NoSeatAvilable extends RuntimeException {

    public NoSeatAvilable(){
        super("No seat Avilable");
    }

    public NoSeatAvilable(String message) {
        super(message);
    }
}
