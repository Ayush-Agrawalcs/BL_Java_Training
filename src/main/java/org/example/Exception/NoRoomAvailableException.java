package org.example.Exception;

public class NoRoomAvailableException extends RuntimeException {

    public NoRoomAvailableException(){
        super("No room Avilable");
    }
    public NoRoomAvailableException(String message) {
        super(message);
    }
}
