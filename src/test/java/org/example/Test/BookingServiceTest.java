package org.example.Test;

import org.example.Exception.NoRoomAvailableException;
import org.example.models.Booking;
import org.example.models.Guest;
import org.example.models.RoomType;
import org.example.services.BookingService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BookingServiceTest {
    @Test
    public void testbooking(){
        BookingService service=new BookingService();
        Guest guest=new Guest("aman","aman@gmail.com","1234567895");
        Booking book=service.bookRoom(guest, RoomType.DELUXE);
       assertNotNull(book);
    }
    @Test(expected = NoRoomAvailableException.class)
    public void testRoomUnavailable() throws Exception {
        BookingService service = new BookingService();
        Guest g1 = new Guest("A", "a@test.com", "9999999999");
        Guest g2 = new Guest("B", "b@test.com", "8888888888");

        service.bookRoom(g1, RoomType.DELUXE);
        service.bookRoom(g2, RoomType.DELUXE);
    }
}
