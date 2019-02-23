//  7. WAP to convert seconds into days, hours, minutes and seconds.

package Java2;

import java.util.Scanner;

public class Question7 {
    int days = 0;
    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public void convertAndDisplay(long s) {
        int dRem = (int) s % 86400;
        days = (int) s / 86400;
        int hRem = dRem % 3600;
        hours = (int) dRem / 3600;
        int mRem = hRem % 60;
        minutes = hRem / 60;
        seconds = mRem;

        System.out.println(days + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds");
    }

    public static void main(String[] args) {
        long second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds value: ");
        second = sc.nextLong();
        Question7 obj = new Question7();
        obj.convertAndDisplay(second);
    }
}
