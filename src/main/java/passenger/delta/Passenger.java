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
        if (    title.equalsIgnoreCase("Mr") ||
                title.equalsIgnoreCase("Mrs") ||
                title.equalsIgnoreCase("Ms")) {
            this.title = title;
        } else {
            String message = "Invalid Title - Mr, Mrs, Ms Accepted --> Entered: " + title;
            throw new IllegalArgumentException(message);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        } else{
            String message = "Invalid Name Length - too short --> Entered: " + name;
            throw new IllegalArgumentException(message);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() >= 10){
            this.id = id;
        } else{
            String message = "Invalid ID Length - too short --> Entered: " + id;
            throw new IllegalArgumentException(message);
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() >= 7){
            this.phone = phone;
        }else{
            String message = "Invalid Phone Length - too short --> Entered: " + phone;
            throw new IllegalArgumentException(message);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 16){
            this.age = age;
        } else{
            String message = "Invalid Age - Passenger is too young --> Entered: " + age;
            throw new IllegalArgumentException(message);
        }
    }

}
