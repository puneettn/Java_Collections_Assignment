package Java_Collections_Assignment;


import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(2.33f);
        list.add(7.89f);
        list.add(6.33f);
        list.add(8.805f);
        list.add(9.40f);

        float sum = 0.0f;
        for (float i : list) {
            sum+=i;
            System.out.print (i+" ");
        }
        System.out.println();
        System.out.println(" The sum of all flaoting numbers " +sum);
    }
}