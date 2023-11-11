package classes;

import java.util.Objects;
public class Bank {
    private final Long id;
    private String name;
    private String code;
    private Address address;
    public Bank(Long id , String name, String code, Address address ){
        this.id = id;
        this.name = name;
        this.code = code;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Address getAddress() {
        return this.address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bank:\n" +
                "Name: " + this.name + "\n" +
                "Code: " + this.code + "\n" +
                "Address:\n" + this.address.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;

        return Objects.equals(this.name, bank.name) &&
                Objects.equals(this.code, bank.code) &&
                Objects.equals(this.id, bank.id) &&
                this.address.equals(bank.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name, this.code, this.address.hashCode());
    }

    //metodo estatico
    // pasar las bank accounts a una lista y a los empleados y clientes. Cuando se venda o se pague una cuenta se va a modificar el balance de la misma
    //Despues con un metodo estatico que le pases una lista de las bank accounts y que te calcule el balance de la misma

}

