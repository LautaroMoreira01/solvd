package classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Person {
    private final Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String phoneNumber;

    public Person(Long id,String firstName , String lastName , String phoneNumber , Date birthDate){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    //getters and setters
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(),this.getFirstName(), this.getLastName(),this.getBirthDate(), this.getPhoneNumber());
    }

    // Equals method should also be overridden for consistency with hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.getFirstName(), person.getFirstName()) &&
                Objects.equals(this.getId(), person.getId()) &&
                Objects.equals(this.getLastName(), person.getLastName()) &&
                Objects.equals(this.getPhoneNumber(), person.getPhoneNumber());
    }

    protected String GetInfo(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = (birthDate != null) ? dateFormat.format(birthDate) : "N/A";
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + formattedDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    protected String getPersonPhoneContactInformation(){
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    abstract double calculatePayment();
}
