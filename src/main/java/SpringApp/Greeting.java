package SpringApp;

public class Greeting {

    private String id;
    private String content;
    private String address;

    public String getId() {
        return id;
    }

    public String getAddress(){return address;}

    public void setAddress(String add){
        this.address = add;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
