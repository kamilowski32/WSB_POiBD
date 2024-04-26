package pl.wsb.hotel;


import java.time.LocalDate;
import java.util.ArrayList;


public class Hotel {
    private String name;

    ArrayList<SpecialService> services;
    ArrayList<Client> clients;
    ArrayList<RoomReservation> reservations;
    ArrayList<Room> rooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SpecialService> getServices() {
        return services;
    }

    public void setServices(ArrayList<SpecialService> services) {
        this.services = services;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<RoomReservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<RoomReservation> reservations) {
        this.reservations = reservations;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Hotel(String name, ArrayList<SpecialService> services, ArrayList<Client> clients, ArrayList<RoomReservation> reservations, ArrayList<Room> rooms) {
        this.name = name;
        this.services = services;
        this.clients = clients;
        this.reservations = reservations;
        this.rooms = rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Hotel(String name) {
        this.name = name;
        services = new ArrayList<>();
        clients = new ArrayList<>();
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

}