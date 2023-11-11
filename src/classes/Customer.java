package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Customer extends Person {
    private String email;
    private Address address;
    private List<Sale> sales ;

    public  Customer(Long id , String firstName , String lastName , String phoneNumber , Date birthDate,String email, Address address){
        super(id,firstName , lastName, phoneNumber, birthDate);
        this.email = email;
        this.address = address;
        this.sales = new ArrayList<>();
    }

    public Address getAddress() {
        return this.address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.email , this.address.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return Objects.equals(this.getEmail(), customer.getEmail()) &&
                Objects.equals(this.getAddress(), customer.getAddress());
    }

    public void addSale(Product product , Integer quantity) {
        sales.add(new Sale( quantity, product ));
    }

    @Override
    public double calculatePayment() {

        double totalPriceSales = 0;

        for(Sale sale : this.sales){
            totalPriceSales += sale.getProduct().getPrice() * sale.getQuantity();
        }

        return totalPriceSales;
    }
}
