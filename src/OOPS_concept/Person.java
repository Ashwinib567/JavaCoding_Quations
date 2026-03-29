package OOPS_concept;

public class Person
{
    String name;
    int age;

    Person( String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        Person p1 = new Person("Jonh", 25);
        Person p2 = new Person("Alice", 30);

        System.out.println("Name: " + p1.name + ", Age: " + p1.age + " Name: " + p2.name + ", Age: " + p2.age);
    }
}
