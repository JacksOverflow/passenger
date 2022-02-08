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
            System.out.println("Invalid Title - Mr, Mrs, Ms Accepted");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        } else{
            System.out.println("Invalid Name Length - too short");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() >= 10){
            this.id = id;
        } else{
            System.out.println("Invalid ID Length - too short");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() >= 7){
            this.phone = phone;
        }else{
            System.out.println("Invalid Phone Length - too short");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        } else{
            System.out.println("Invalid Age - Passenger is too young");
        }
    }

}
