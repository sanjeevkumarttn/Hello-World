// 8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement
//b)do-while statement

package Java2;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Question8 obj = new Question8();
        System.out.println(obj.callWhile());
        System.out.println(obj.callDoWhile());

    }

    StringBuffer callWhile() {

        String word;
        StringBuffer SBuff = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("While loop Started....");
        System.out.print("Enter the word: ");
        word = sc.next();
        while (!word.equalsIgnoreCase("done")) {

            SBuff.append(word + " ");
            System.out.print("Enter the word: ");
            word = sc.next();
        }
        System.out.println("Words you have entered before: " + word);

        return SBuff;
    }

    StringBuffer callDoWhile() {

        String word;
        boolean continueLoop = true;
        StringBuffer SBuff = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo-While loop Started....");
        do {
            System.out.print("Enter the word: ");
            word = sc.next();
            if (word.equalsIgnoreCase("done"))
                continueLoop = false;
            if (continueLoop)
                SBuff.append(word + " ");
        } while (continueLoop);
        System.out.println("Words you have entered before: " + word);

        return SBuff;
    }
}
