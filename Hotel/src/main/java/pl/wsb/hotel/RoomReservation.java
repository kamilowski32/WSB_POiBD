package pl.wsb.hotel;

import java.time.LocalDate;

public class RoomReservation {
    Client client;
    Room room;
    LocalDate date;
    boolean isConfirmed;

    public RoomReservation(Client client, Room room, LocalDate date) {
        this.client = client;
        this.room = room;
        this.date = date;
        this.isConfirmed = false;
    }

    public void confirmReservation()
    {
        this.isConfirmed = true;
    }

    //setters

    public void setClient(Client client) {
        this.client = client;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    //getters

    public Client getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
