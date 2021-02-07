package search;

public class Person {

    private String phone;
    private String address;
    private String surname;
    private String name;

    public Person(String phone, String address, String surname, String name) {
        this.phone = phone;
        this.address = address;
        this.surname = surname;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}

