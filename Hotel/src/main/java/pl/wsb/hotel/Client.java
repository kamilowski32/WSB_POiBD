package pl.wsb.hotel;


import java.time.LocalDate;
import java.time.Period;

public class Client {
    private String id;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private String countryOfBirth;
    private String typeOfDocument;
    private String documentNumber;

    public Client(String id, LocalDate birthDate, String firstName, String lastName, String countryOfBirth, String typeOfDocument, String documentNumber) {
        this.id = id;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOfBirth = countryOfBirth;
        this.typeOfDocument = typeOfDocument;
        this.documentNumber = documentNumber;
    }

    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setTypeOfDocument(String typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    //Getters


    public String getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public int getAge()
    {
        LocalDate now = LocalDate.now();
        return Period.between(birthDate, now).getYears();
    }
}
