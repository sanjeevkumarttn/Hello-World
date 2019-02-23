//  5. WAP to show object cloning in java using cloneable and copy constructor both.

package Java2;

public class Question5 {

    public static void main(String[] args) {

        Student s1 = new Student(11, "Rohit", 78.8f);
        System.out.println("First Student Details.....\nRoll no.: " + s1.roll + ", Name: " + s1.name + ", Marks: " + s1.marks);

        Student s2 = new Student(s1);
        System.out.println("Second Student Details.....\nRoll no.: " + s2.roll + ", Name: " + s2.name + ", Marks: " + s2.marks);
        try {
            System.out.println("\n///////////////////////////////////\n");
            Employee e1 = new Employee(23, "Rehan", 25);
            System.out.println("First Employee Detail....\nId: " + e1.eId + ", Name: " + e1.name + ", Age: " + e1.age);

            Employee e2 = (Employee) e1.clone();
            System.out.println("After cloning.....");
            System.out.println("Second Employee Detail....\nId: " + e2.eId + ", Name: " + e1.name + ", Age: " + e1.age);

        } catch (CloneNotSupportedException e) {
        }

    }

}

class Student {
    int roll;
    String name;
    float marks;

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student s) {
        System.out.println("In Copy Constructor....");
        roll = s.roll;
        name = s.name;
        marks = s.marks;
    }
}

class Employee implements Cloneable {
    int eId;
    String name;
    int age;

    Employee(int id, String name, int age) {
        this.eId = id;
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}