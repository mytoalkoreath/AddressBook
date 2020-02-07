public class Controller {

    private AddressBook book;
//    private View view;
//    public Controller(){
//
//    }
    public Controller(AddressBook book){
//        this.view = view;
        this.book = book;
    }

    public void addBuddy(String Name, String pNumber){
        book.addBuddy(Name, pNumber);
    }

    public Boolean removeBuddy(String Name){
        return book.removeBuddy(Name);
    }
    public String getBuddyName(int index){
        return book.getName(index);
    }
    public String getBuddyPNumber(int index){
        return book.getPNumber(index);
    }

    public String getText(){
        return book.toString();
    }


}

