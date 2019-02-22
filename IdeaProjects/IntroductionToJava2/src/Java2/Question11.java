package Java2;

public class Question11 {

    public static void main(String[] args) {

        int s = 0;
        int t = 1;
        /*for (int i = 0; i < 10; i++)
        {
            s = s + i;
            for (int j = i; j > 0; j--)
            {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);*/
/////////////////////////////////////////////////////
        System.out.println("While loop");
        int j, i = 0;
        while (i < 10) {
            j = i;
            s = s + i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }
}
