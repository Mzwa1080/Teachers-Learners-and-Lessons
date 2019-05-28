public class Person {
    private String fName,lName,Email;

    public Person(String fullName, String lastName, String email ){
        this.fName =fullName;
        this.lName = lastName;
        this.Email = email;
    }

    public Person() {
    }

    public String getEmail() {
        return Email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}


