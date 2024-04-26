package pl.wsb.hotel;

import pl.wsb.hotel.Resources.Enums;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Simulation {
    public static void main(String[] args) throws InterruptedException {
        Room room1 = new Room("312", "Room with view on mountains.", 40.5, 3, true, true, 4, false);
        Room room2 = new Room("201", "Room with view on sea.", 30,2,true,false,2,true);

        PremiumClient c1 = new PremiumClient("123", LocalDate.now(),"Adam", "Nowak", "Poland", "Passport", "132JDOSN3N", Enums.PremiumClientType.PREMIUM);
        PremiumClient c2 = new PremiumClient("123", LocalDate.now(),"Adam", "Kowal", "Poland", "Passport", "132JDOSN3N", Enums.PremiumClientType.PREMIUM_PLUS);
        Client c3 = new Client("123", LocalDate.now(),"Adam", "Robak", "Poland", "Passport", "132JDOSN3N");

        System.out.println(c1.getFullName());
        System.out.println(c3.getFullName());

        TimeService time = new TimeService();
        LuggageService luggage = new LuggageService();

        ArrayList<SpecialService> services = new ArrayList<>();
        services.add(luggage);
        services.add(time);

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        ArrayList<RoomReservation> reservations = new ArrayList<>();
        reservations.add(new RoomReservation(c1, room1, LocalDate.now()));
        reservations.add(new RoomReservation(c2, room2, LocalDate.now()));



        Hotel h1 = new Hotel("First", services, clients, reservations, rooms);
        Hotel h2 = new Hotel("Second");
        h2.setClients(clients);
        h2.setRooms(rooms);
        h2.setReservations(reservations);
        h2.setServices(services);

        System.out.println(h1.getServices().get(0).whenUsedLastTime());
        h2.getServices().get(0).orderService();

        System.out.println(h1.getClients().get(0).getFullName());
        System.out.println(h2.getClients().get(2).getFullName());

        System.out.println(h1.getReservations().get(0).getDate());
        System.out.println(h2.getReservations().get(0).isConfirmed());

        System.out.println("After 10 seconds");
        TimeUnit.SECONDS.sleep(10);

        System.out.println(h1.getServices().get(0).whenUsedLastTime());
        System.out.println(h2.getServices().get(0).getTimesUsed());
    }
}
