package heroes;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person("Roman", 52);
        person1.speak();
        person1.saySomething();
        Person person2 = new Person("Alexey", 20);
        person2.speak();
        person2.saySomething();
        int year1 = person1.calculateToRetirement();
        int year2 = person2.calculateToRetirement();
        System.out.println("First men do " + year1);
    }
}

class Person{
     private String name;
     private int age;

     public int calculateToRetirement(){
         int years = 65 - age;
         return years;
     }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("My name is " + name + "," + " and me " + age);
    }

    void saySomething() {
        System.out.println("Something");
    }
}

