package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) { //i:index numbers of list
            list.set(i,list.get(i)*2);

        }
        System.out.println(list);

        System.out.println("++++++++++++++++++++++++");
ArrayList<String> employess= new ArrayList<>();
employess.add("tarik");
        employess.add("tekin");
        employess.add("Sue");
        employess.add("gokhan");
        employess.add("mehmet");
        employess.add("ahmet");
        employess.add("Sueda");
        System.out.println(employess);
employess.remove(0);

        System.out.println(employess);

        employess.remove(0);

        System.out.println(employess);

employess.remove(employess.size()-1);
        System.out.println(employess);


        employess.remove("gokhan");

        System.out.println(employess);
    }
}
