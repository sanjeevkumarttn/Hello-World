//  3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

/*

Run the program then delete the 'NoClassDefFound.class' file -> It will give
' java.lang.NoClassDefFoundError: Java2/NoClassDefFound' exception.

and at line:21 'Class.forName("NoClassDefFound");' -> It will give
'java.lang.ClassNotFoundException: Java2.NoClassDefFound' exception.

check alternatively after commenting line:19 and line:20 to 25.
 */

package Java2;

public class Question3 {

    public static void main(String[] args) {
        NoClassDefFound obj1 = new NoClassDefFound();
//        try {
//            Class.forName("NoClassDefFound");
//        } catch (ClassNotFoundException e) {
//            // System.out.println();
//            e.printStackTrace();
//        }
    }
}

class NoClassDefFound{

}
