package classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Company {
    private Long id;
    private String name;
    private Address address;
    private List<Employee> employees;
    private static int countEmployeeHistory;

    static{
        countEmployeeHistory = 0;
    }

    //Getters and setters
    public  Company(String name){
        this.name= name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        StringBuilder employeesInfo = new StringBuilder();
        for (Employee employee : employees) {
            employeesInfo.append(employee.toString()).append("\n");
        }

        return "Company:\n" +
                "Name: " + name + "\n" +
                "Address:\n" +
                "Country Name: " + address.getCountryName() + "\n" +
                "City Name: " + address.getCityName() + "\n" +
                "Street Name: " + address.getStreetName() + "\n" +
                "Street Code: " + address.getStreetCode() + "\n" +
                "Employees:\n" + employeesInfo.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(this.getName(), company.getName()) &&
                Objects.equals(this.getId(), company.getId()) &&
                Objects.equals(this.getAddress(), company.getAddress());
             /* && Arrays.equals(this.getEmployees(), company.getEmployees());*/
    }
    @Override
    public int hashCode() {

        int result = Objects.hash(this.getName(), this.getAddress() , this.getId());

        for (Employee e : getEmployees()) {
            result = 31*result + (e==null ? 0 : e.hashCode());
        }

        return result;
    }

    //contract employee
    public void contractEmployee(Employee employee) {

        Employee employeeExist = findEmployeeById(employee.getId());

        if (employeeExist != null){
            //if the employee not exist will be added to the count employeeHistory
            countEmployeeHistory ++;

            this.getEmployees().add(employee);
        }else{
            System.out.println("Employee already exist.");
        }

    }
    private Employee findEmployeeById(Long employeeId) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee; // Return the employee object if found
            }
        }
        return null; // Return null if no employee with the given ID is found
    }

    public void fireEmployeeById(Long employeeId) {
        boolean removed = employees.removeIf(employee -> employee.getId().equals(employeeId));
        if (removed) {
            System.out.println("Employee with ID " + employeeId + " has been fired.");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    //fire employee
}

