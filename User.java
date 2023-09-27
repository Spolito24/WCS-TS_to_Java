import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Address address;
    

    public User(Date birthDate, int size, List<Photo> photos, Address address) {
        this.birthdate = birthDate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

// import { Address } from './address';
// import { Photo } from './photo';

// export class User {
//     birthdate: Date;
//     size: number;
//     photos: Photo[];
//     address: Address;
// }