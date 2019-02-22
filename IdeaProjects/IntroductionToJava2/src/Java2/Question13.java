package Java2;


import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

public class Question13 {

    String name;
    int age;

    void getDetail() throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter voter name: ");
        name = sc.nextLine();
        System.out.print("Enter voter age: ");
        age = sc.nextInt();

        if (age < 18)
            throw new InvalidAgeException("Age is not valid: Age should be 18 or greater than 18.");
        else
            System.out.println("\nName: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Question13 obj = new Question13();
        try {
            obj.getDetail();
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
