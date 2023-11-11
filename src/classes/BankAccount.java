package classes;
import java.util.Objects;

public class BankAccount {
    private Long id;
    private Bank bank;
    private String alias;
    private String number;
    public BankAccount(Long id,String number , Bank bank , String alias){
        this.id = id;
        this.number = number;
        this.bank = bank;
        this.alias = alias;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAlias() {
        return this.alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public Bank getBank() {
        return this.bank;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BankAccount:\n" +
                "Bank:\n" +
                "Name: " + this.bank.getName() + "\n" +
                "Code: " + this.bank.getCode() + "\n" +
                "Address:\n" + this.bank.toString() +
                "Alias: " + this.alias+ "\n" +
                "Number: " + this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(this.bank, that.getBank()) &&
                Objects.equals(this.id, that.getId()) &&
                Objects.equals(this.alias, that.getAlias()) &&
                Objects.equals(this.number, that.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bank.hashCode(), this.getAlias(), this.getNumber() , this.getId());
    }

}
