package JE1.ArrayList;

import java.util.Arrays;

public class IntArrayListMain {

    public class Test{

    }

    public static void main(String[] args) {


        IntList birthDates = new IntArrayList();

        birthDates.add(1970);
        birthDates.add(1985);
        birthDates.add(1992);
        birthDates.add(2000);
        birthDates.add(2002);
        birthDates.add(2005);
        birthDates.add(1967);


        System.out.println(birthDates.toString());
        System.out.println(Arrays.toString(birthDates.toArray()));

        System.out.println(birthDates.size());
        System.out.println(birthDates.get(3));
        System.out.println(birthDates.set(9, 1974));

        System.out.println("After using set method: " + birthDates.toString());





    }
}