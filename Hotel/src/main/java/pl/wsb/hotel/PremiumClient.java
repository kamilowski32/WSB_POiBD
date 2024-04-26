package pl.wsb.hotel;

import java.time.LocalDate;

import pl.wsb.hotel.Resources.Enums;
import pl.wsb.hotel.Resources.Enums.PremiumClientType;

public class PremiumClient extends Client{

    private PremiumClientType type;

    public PremiumClient(String id, LocalDate birthDate, String firstName, String lastName, String countryOfBirth, String typeOfDocument, String documentNumber, PremiumClientType clientType) {
        super(id, birthDate, firstName, lastName, countryOfBirth, typeOfDocument, documentNumber);
        this.type = clientType;
    }

    @Override
    public String getFullName() {
        return "[premium]" + super.getFullName();
    }

    public PremiumClientType getType() {
        return type;
    }

    public void setType(PremiumClientType type) {
        this.type = type;
    }
}
