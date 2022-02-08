package passenger.delta;
import java.lang.String;

public class Passenger {
    /*
        Title (mr, mrs, ms)
        Name (min 3 chars)
        ID (min 10 chars)
        Phone (min 7 chars)
        Age ( > 16 -- or no fly)
         */
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
