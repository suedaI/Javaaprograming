package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {


        String []countries={"japan","korea","united state","turkey","united kingdom","canada"};
        //converting array to arraylist:
        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p->p.length()>=10);
        //converting arraylist to back to array

       countries= list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));




    }
}
