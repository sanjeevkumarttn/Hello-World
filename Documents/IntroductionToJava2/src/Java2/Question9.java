import java.util.Scanner;

interface Furniture {
    public void stressTest();
    public void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();

}
abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("\nPassed stress test.");
    }

    @Override
    public void fireTest() {
        System.out.println("\nPassed fire test.");
    }

    @Override
    public String chairType() {
        String s = "This is a metal Chair";
        return s;
    }
}

class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("\nFailed stress test.");
    }

    @Override
    public void fireTest() {
        System.out.println("\nFailed fire test.");
    }

    @Override
    public String chairType() {
        String s = "This is a wooden Chair.";
        return s;
    }
}

class MetalTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Passed Stress Test.");
    }

    @Override
    public void fireTest() {
        System.out.println("Passed fire test.");
    }

    @Override
    public String tableType() {
        String s = "This is a metal Table.";
        return s;
    }
}


class WoodenTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Failed Stress Test.");
    }

    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test.");
    }

    @Override
    public String tableType() {
        String s = "This is a wooden Table.";
        return s;
    }
}

public class Question9 {
    public static void main(String[] args){
        Table table = null;
        Chair chair = null;

        Scanner s =  new Scanner(System.in);
        System.out.println("\nEnter furniture type: ");
        String str = s.nextLine();

        if(str.equals("wooden table")){
            table = new WoodenTable();
            System.out.println(table.tableType());
            table.stressTest();
            table.fireTest();
        }
        else if (str.equals("metal table")){
            table = new MetalTable();
            System.out.println(table.tableType());
            table.stressTest();
            table.fireTest();
        }
        else if(str.equals("wooden chair")){
            chair = new WoodenChair();
            System.out.println(chair.chairType());
            chair.stressTest();
            chair.fireTest();
        }
        else if(str.equals("metal chair")){
            chair = new MetalChair();
            System.out.println(chair.chairType());
            chair.stressTest();
            chair.fireTest();
        }
        else{
            System.out.println("\nInvalid furniture type.");
        }
    }
}