
import java.util.*;

import SpringApp.BuddyInfo;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

@Entity
public class AddressBook {

    private Long id;
    private String Name;

    private ArrayList<BuddyInfo> buddies;
    public AddressBook(String Name) {
        buddies = new ArrayList<BuddyInfo>();
        this.Name = Name;
    }


    public void addBuddy(String name, String pNumber){

        buddies.add(new BuddyInfo(name, pNumber));
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public Boolean removeBuddy(String name){
        BuddyInfo test;
       for(int i = 0;i<buddies.size();i++){
            test = buddies.get(i);
            if(test.getName().equals(name) ){
                buddies.remove(test);
                return true;
            }
        }
        return false;
    }


    public Collection<BuddyInfo> getBuddies() {
        Collection<BuddyInfo> output = buddies;
        return output;
    }

    public void setBuddies(Collection<BuddyInfo> input){
        buddies = new ArrayList<BuddyInfo>(input);
    }


    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {

        String output = "AddressBook{" + "buddies=";
        for(int n = 0; n < buddies.size() ; n++){
            output = output+buddies.get(n).toString()+"\n";
        }

        return output+"}";
    }

    public String getName(int index){
        return buddies.get(index).getName();
    }

    public String getPNumber(int index){
        return buddies.get(index).getpNumber();
    }

//    public static void main(String[] args){
//        AddressBook a = new AddressBook();
//        a.addBuddy("Matt", "623 845 9878");
//        a.addBuddy("Frank", "623 902 6729");
//        a.addBuddy("George", "623 472 1084");
//        a.addBuddy("Leslie", "623 049 7283");
//
//
//        System.out.println(a.toString());
//        JPATest j = new JPATest();
//        j.performJPA();
//
//    }

}
