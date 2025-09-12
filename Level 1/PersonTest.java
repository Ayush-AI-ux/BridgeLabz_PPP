public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ayush", 21);
        Person p2 = new Person(p1); 
        System.out.println("\nPerson1 -> " + p1.getName() + ", Age: " + p1.getAge());
        System.out.println("Person2 (copy) -> " + p2.getName() + ", Age: " + p2.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
