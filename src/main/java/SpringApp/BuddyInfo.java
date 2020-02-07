package SpringApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    private String pNumber;
    private String name;
    private String address;
    private Long id;

    public BuddyInfo(){
        name = "test";
        pNumber = "test";
        address = "test";
    }

    @Override
    public String toString() {
        return "BuddyInfo{" +
                "name='" + name + '\'' +
                ", pNumber='" + pNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    public BuddyInfo(String name, String pNumber, String add) {
        this.name = name;
        this.pNumber = pNumber;
        this.address = add;
    }


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String add){
        this.address=add;
    }
}
