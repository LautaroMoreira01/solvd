package classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Deposit {
    private final Long id;
    private Long capacity;
    private Address address;

    private List<Product> products;
    public  Deposit(Long id , Long capacity , Address address){
        this.id =  id;
        this.capacity =  capacity;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
    public Long getCapacity() {
        return capacity;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    //    protected boolean insertProduct(Product product){
    //        int index  = notExistProductInDeposit(product);
    //        if (this.products.length == this.capacity && index > 0 ){
    //        }
    //    }
    //    protected int notExistProductInDeposit(Product product){
    //        if(this.products.length == this.capacity){
    //            for (Product productInArray:products) {
    //            }
    //        }
    //        return  false;
    //    }

    protected double getTotalProductPricesInDeposit(){

        double totalPriceProducts = 0;

        for(Product product : products){
            totalPriceProducts += product.getPrice() * product.getQuantity();
        }

        return totalPriceProducts;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, capacity, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Objects.equals(id, deposit.id) &&
                Objects.equals(capacity, deposit.capacity) &&
                Objects.equals(address, deposit.address);
    }

}
