package pl.wsb.hotel;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class LuggageService extends SpecialService{

    public LuggageService() {
        this.setTimesUsed(0);
        this.setDatetime(LocalDateTime.now());
    }

    @Override
    public void orderService() {
        System.out.println("We have your luggage");
        this.setDatetime(LocalDateTime.now());
        this.setTimesUsed(this.getTimesUsed()+1);
    }

    @Override
    public void showServiceName(int times) {
        System.out.println("Luggage Service");
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
