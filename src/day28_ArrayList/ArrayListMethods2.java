package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(500);
        System.out.println(list);

        list.remove(1);

        System.out.println(list);
        Integer num = 200;
//list.remove(200);
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);
        System.out.println("===========================================");

        list.clear();
        System.out.println(list.size());

        System.out.println(list);

        System.out.println("==================================");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');


      int a= characters.indexOf('A'); //0
       int b= characters.lastIndexOf('A');//5

        System.out.println(a);

        System.out.println(b);

        System.out.println("==============================");
boolean r2=characters.contains('A');
boolean r3=characters.contains('Z');
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("=======================");

ArrayList<Integer> list1=new ArrayList<>();
list1.add(100);
list1.add(100);
list1.add(100);
        ArrayList<Integer> list2=new ArrayList<>();
list2.add(100);
list2.add(100);
list2.add(100);

        System.out.println(list1 == list2); //false. because; new

        System.out.println(list1.equals(list2)); // same elements; true


        System.out.println("++++++++++++++++++++++++++++++++++++");
       boolean result= list1.isEmpty();//false
        System.out.println(result);

        System.out.println("=================");

        








    }
}
