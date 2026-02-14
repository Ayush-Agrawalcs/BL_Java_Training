package org.example.services;

import Validation.Validationutil;
import org.example.Annotation.BookingValidation;
import org.example.Exception.NoRoomAvailableException;
import org.example.models.Booking;
import org.example.models.Guest;
import org.example.models.Room;
import org.example.models.RoomType;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingService {
    List<Booking> list=new ArrayList<>();
    LinkedList<Guest>wait=new LinkedList<>();
    Stack<Booking> st=new Stack<>();
    Queue<Guest>fcfc=new LinkedList<>();
    Set<Guest>se=new HashSet<>();

    Map<RoomType, AtomicInteger>map=new HashMap<>();
    Validationutil valid=new Validationutil();

    public BookingService(){
        map.put(RoomType.DELUXE,new AtomicInteger(1));
        map.put(RoomType.STANDARD,new AtomicInteger(2));
    }

    @BookingValidation(requiredFields = {"email","phone","roomtype"})
    public Booking bookRoom(Guest guest,RoomType room) throws NoRoomAvailableException {
        if(!valid.ValidateEmail(guest.getEmail())){
            throw new IllegalArgumentException("Invalid Email");
        }
        if(!valid.Validatephonel(guest.getPhone())){
            throw new IllegalArgumentException("Invalid phone");
        }
        se.add(guest);
        fcfc.add(guest);

        AtomicInteger count = map.get(room);

        if (count.get() == 0) {
            wait.add(guest);
            throw new NoRoomAvailableException("No rooms available. Added to waitlist.");
        }

        count.decrementAndGet();

        Room roo = new Room(room,
                room == RoomType.DELUXE ? 3000 : 1500);
        roo.setAvilable(false);

        Booking booking = new Booking(guest, roo);
        list.add(booking);
        st.push(booking);

        return booking;

    }

    public void undoBooking() {
        if (!st.isEmpty()) {
            Booking book = st.pop();
            RoomType room = book.getRoom().getRoom();
            map.get(room).incrementAndGet();
            list.remove(book);
        }
    }

        public List<Room> getAvilableRoom(RoomType t){
            return list.stream().map(Booking::getRoom).
                    filter(r->r.getRoom()==t)
                    .filter(Room::isAvilable).
                    sorted(Comparator.comparing(Room::getPrice))
                    .toList();
        }
}
