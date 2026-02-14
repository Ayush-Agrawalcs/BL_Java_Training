package org.example;

import org.example.Exception.NoRoomAvailableException;
import org.example.models.Booking;
import org.example.models.Guest;
import org.example.models.RoomType;
import org.example.services.BookingService;


public class App 
{
    public static void main( String[] args )
    {
        BookingService bookingService=new BookingService();
        Guest guest1=new Guest("Ayuhs","Ayuhs@gmail.com","8439645109");
        Guest guest2=new Guest("Rahul","rahul@gmail.com","1234567892");

        try{
            System.out.println("Booking 1...");
            Booking booking1=bookingService.bookRoom(guest1, RoomType.DELUXE);
            System.out.println("Booked: "+booking1.getRoom().getRoom());

            System.out.println("Booking 2...");
            Booking booking2=bookingService.bookRoom(guest2,RoomType.STANDARD);
            System.out.println("Booked : "+booking2.getRoom().getRoom());
        } catch (NoRoomAvailableException e) {
            System.out.println("Exception: "+e.getMessage());
        }catch (IllegalAccessError e){
            System.out.println("Validation Error: "+e.getMessage());
        }
        finally {
            System.out.println("Booking Attempt Finished");
        }

        System.out.println("undoing last booking");
        bookingService.undoBooking();

        System.out.println("Application finished");


    }
}
