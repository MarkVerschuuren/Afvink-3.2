/**
 * Created by Mark Verschuuren on 28-12-2016.
 */
import java.util.*;
import java.util.Random;
public class CompareList {
    public static void main(String[] args) {
        Random Rand = new Random();
        ArrayList<Integer> ArrayLNumbers = new ArrayList<>();
        LinkedList<Integer> LinkedNumbers = new LinkedList<>();
        for(int count = 0; count < 10000000;count++){
            ArrayLNumbers.add(Rand.nextInt(10));
            LinkedNumbers.add(Rand.nextInt(10));
        }
        long Starttime = new Date().getTime();
        ArrayLNumbers.indexOf(9999999);
        long Endtime = new Date().getTime();
        long Starttime2 = new Date().getTime();
        LinkedNumbers.indexOf(9999999);
        long Endtime2 = new Date().getTime();

        System.out.println("It took :" + (Endtime-Starttime)+ "ms");
        System.out.println("It took :" + (Endtime2-Starttime2)+ "ms");

        System.out.println(ArrayLNumbers.size());
        long Starttime3 = new Date().getTime();
        ArrayLNumbers.add(5,Rand.nextInt(30000));
        long Endtime3 = new Date().getTime();
        System.out.println(ArrayLNumbers.size());

        System.out.println(LinkedNumbers.size());
        long Starttime4 = new Date().getTime();
        LinkedNumbers.add(5,Rand.nextInt(30000));
        long Endtime4 = new Date().getTime();
        System.out.println(LinkedNumbers.size());

        System.out.println("It took :" + (Endtime3-Starttime3)+ "ms");
        System.out.println("It took :" + (Endtime4-Starttime4)+ "ms");
    }
}
