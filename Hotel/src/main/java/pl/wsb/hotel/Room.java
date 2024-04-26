package pl.wsb.hotel;

public class Room {
    private String id;
    private String description;
    private double area;
    private int floor;
    private boolean hasKingSizeBed;
    private boolean hasBalcony;
    private int maxNoOfPeople;
    private boolean hasJacuzzi;

//Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setHasKingSizeBed(boolean hasKingSizeBed) {
        this.hasKingSizeBed = hasKingSizeBed;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setMaxNoOfPeople(int maxNoOfPeople) {
        this.maxNoOfPeople = maxNoOfPeople;
    }

    public void setHasJacuzzi(boolean hasJacuzzi) {
        this.hasJacuzzi = hasJacuzzi;
    }


    //Getters


    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isHasKingSizeBed() {
        return hasKingSizeBed;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public int getMaxNoOfPeople() {
        return maxNoOfPeople;
    }

    public boolean isHasJacuzzi() {
        return hasJacuzzi;
    }

    public Room(String id, String description, double area, int floor, boolean hasKingSizeBed, boolean hasBalcony, int maxNoOfPeople, boolean hasJacuzzi) {
        this.id = id;
        this.description = description;
        this.area = area;
        this.floor = floor;
        this.hasKingSizeBed = hasKingSizeBed;
        this.hasBalcony = hasBalcony;
        this.maxNoOfPeople = maxNoOfPeople;
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public String toString() {
        return "Room" + id + '\n' +
                "Description='" + description + '\'' +
                "Area=" + area +
                "Floor=" + floor +
                "King Size Bed=" + hasKingSizeBed +
                "Balcony=" + hasBalcony +
                "Max number of people sleeping in room=" + maxNoOfPeople +
                "Jacuzzi=" + hasJacuzzi;
    }
}
