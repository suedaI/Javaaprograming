package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("sueda",'f',29,6789,'A');
        Student student2=new Student("ahmet");
        Student student3=new Student("olga",'F',32);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("=====================");
        System.out.println(student1==student2);
        System.out.println("--------------------------");
        Student[] students={student1,student2,student3};

        System.out.println(Arrays.toString(students));
    }
}
