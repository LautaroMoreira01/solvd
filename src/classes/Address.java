package classes;
import java.util.Objects;

public class Address {
    private String countryName;
    private String cityName;
    private String streetName;
    private final Long id;
    private String streetCode;
    public  Address(Long id ,String countryName, String cityName, String streetName , String streetCode){
        this.id = id;
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.streetCode = streetCode;
    }

    //Getters and Setters
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getStreetName() {
        return this.streetName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName() {
        return this.countryName;
    }
    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }
    public String getStreetCode() {
        return this.streetCode;
    }
    public String getCityName() {
        return this.cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getId() {
        return id;
    }

    public String toString() {
        return "Address:\n" +
                "Country Name: " + this.countryName + "\n" +
                "City Name: " + this.cityName + "\n" +
                "Street Name: " + this.streetName + "\n" +
                "Street Code: " + this.streetCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return Objects.equals(this.countryName, address.countryName) &&
                Objects.equals(this.id, address.id) &&
                Objects.equals(this.cityName, address.cityName) &&
                Objects.equals(this.streetName, address.streetName) &&
                Objects.equals(this.streetCode, address.streetCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id , this.countryName, this.cityName, this.streetName, this.streetCode);
    }
}
