package classes;

import programExceptions.invalidHoursException;

import java.util.Date;
import java.util.Objects;

public class Employee extends  Person{
    private String code;
    private Double hoursWorked;
    private Double hourSalary;
    private String companyEmail;
    public Employee(Long id, Double hourSalary , String firstName , String lastName , String phoneNumber , Date birthDate, String companyEmail){
        super(id ,firstName , lastName, phoneNumber, birthDate);
        this.companyEmail = companyEmail;
        this.hourSalary = hourSalary;
        this.hoursWorked = 0D;
    }
    public String getCompanyEmail() {
        return companyEmail;
    }
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Double getHourSalary() {
        return hourSalary;
    }
    public void setHourSalary(Double hourSalary) {
        this.hourSalary = hourSalary;
    }
    public Double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void addHourWorked(Double hoursWorked) throws invalidHoursException {
        //exepcion de que no se pueden agregar horas negativas?
        if (hoursWorked  < 0){
            throw new invalidHoursException("The hours must be grather than zero");
        }

        this.hoursWorked += hoursWorked;
    }

    @Override
    public String toString() {
        return super.getPersonPhoneContactInformation() + " - Employee code: " + getCode();
    }

    @Override
    public  double calculatePayment( ) {
        return this.getHourSalary() * this.getHoursWorked() ;
    }
}
