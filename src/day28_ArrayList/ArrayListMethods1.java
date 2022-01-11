package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();


      numbers.add(10);    //index:0
        numbers.add(20);//        1
        numbers.add(20);  //      2
        numbers.add(14);   //     3
        numbers.add(2, 23);
        System.out.println(numbers);

        System.out.println(numbers.size());
        System.out.println("=========================");
        int lastIndex=numbers.size()-1;
        System.out.println(lastIndex);

        Integer num=numbers.get(3);

        System.out.println(num);
        for (int i = 0; i <numbers.size()-1 ; i++) {
            System.out.println(numbers.get(i));
            System.out.println("+++++++++++++++++++++++++++++");
            ArrayList<String> list=new ArrayList<>();
            list.add("java");
            list.add("Python");
            list.add("C#");
            list.add("rubby");
list.add("java");

list.set(2,"java Scrips");
list.set(3,"C++");//replace

            System.out.println(list);





        }


    }
}
