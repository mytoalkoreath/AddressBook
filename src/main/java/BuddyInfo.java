
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class BuddyInfo {
    private String pNumber;
    private String name;
    private Long id;

    public BuddyInfo(){
        name = "test";
        pNumber = "test";
    }

    @Override
    public String toString() {
        return "BuddyInfo{" +
                "pNumber='" + pNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



    public BuddyInfo(String name, String pNumber) {
        this.name = name;
        this.pNumber = pNumber;
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
}
