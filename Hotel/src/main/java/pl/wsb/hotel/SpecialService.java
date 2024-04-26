package pl.wsb.hotel;

import java.time.LocalDateTime;

public abstract class SpecialService {
    private String name;
    private LocalDateTime datetime;
    private int timesUsed = 0;

    public abstract void orderService();

    public abstract void showServiceName(int times);

    public abstract long whenUsedLastTime(); //In seconds

    public abstract int howManyTimesUsed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public int getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(int timesUsed) {
        this.timesUsed = timesUsed;
    }
}
