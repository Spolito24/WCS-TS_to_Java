public class Address {
    private String title;
    private String street;
    private String city;
    private String country;

    public Address(String title, String street, String city, String country) {
        this.title = title;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }    
}


// export class Address {
//     number: string;
//     street: string;
//     city: string;
//     country: string;
// }