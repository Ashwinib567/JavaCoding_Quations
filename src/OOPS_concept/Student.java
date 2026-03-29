package OOPS_concept;

public class Student {
   String name;
   int rollNo;
   char section;

   Student(String name, int rollNo, char section)
   {
       this.name = name;
       this.rollNo = rollNo;
       this.section = section;

   }

   public void display()
   {
       System.out.println( "OOPS_concept.Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
   }

   public static void main(String[] args)
   {
       Student s = new Student("Bob", 101, 'A');

       s.display();
   }
}
