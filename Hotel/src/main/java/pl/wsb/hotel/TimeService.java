package pl.wsb.hotel;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class TimeService extends SpecialService{

    public TimeService() {
        this.setTimesUsed(0);
        this.setDatetime(LocalDateTime.now());
    }

    @Override
    public void orderService() {
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        this.setDatetime(datetime);
        this.setTimesUsed(this.getTimesUsed() + 1);
    }

    @Override
    public void showServiceName(int times) {
        System.out.println("TimeService");
    }

    @Override
    public long whenUsedLastTime() {
        if (getTimesUsed() == 0)
            return -1;
        return SECONDS.between(this.getDatetime(), LocalDateTime.now());
    }

    @Override
    public int howManyTimesUsed() {
        return this.getTimesUsed();
    }
}
