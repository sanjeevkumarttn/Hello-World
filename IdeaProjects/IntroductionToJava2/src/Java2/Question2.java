//  2. WAP to sorting string without using string Methods?.

package Java2;

import java.util.Scanner;

public class Question2 {

    public String sortString(String str) {

        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i)) <= 90 && (int) str.charAt(i) >= 65)
                array[i] = (char) (((int) str.charAt(i)) + 32);
            else
                array[i] = str.charAt(i);
        }
        //char array[] = str.toCharArray();
        //System.out.println(array);
       /* for(int i=0; i<str.length(); i++)
        {
            for(int j=0; j<str.length()-1; j++)
            {

                if( (int)array[j] <= 90 && (int)array[j] >= 65 ){
                    array[j] = (char)(((int)array[j]) + 32);
                    caseConverted = true;
                }

                if(array[j] > array[j+1]){
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
                if(caseConverted && swapped)
                    array[j+1] = (char)(((int)array[j+1]) - 32);
                if(caseConverted && !swapped)
                    array[j] = (char)(((int)array[j]) - 32);

                swapped = false;
                caseConverted = false;
            }
        }
        //System.out.println(array);*/

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - 1; j++) {

                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        //System.out.println(array);
        return new String(array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        Question2 obj = new Question2();
        String sortedString = obj.sortString(str);
        System.out.println("String After sorting: " + sortedString);

    }
}
