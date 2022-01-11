package day30_CustomClass;

import java.util.AbstractList;
import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("sueda", 'F', 29, 2210, 'A');


        Student student2 = new Student();
        student2.setInfo("gokhan", 'M', 33, 3456, 'A');

        Student student3 = new Student();
        student3.setInfo("elmira", 'F', 45, 5609, 'F');
        Student student4 = new Student();
        student4.setInfo("kemal", 'F', 23, 7658, 'C');

        Student student5 = new Student();
        student5.setInfo("ali", 'M', 31, 5409, 'B');

        Student[] students={student1,student2,student3,student4,student5};
        for (Student student:students){
            System.out.println(student);
        }
        System.out.println("==========================================================");
        ArrayList<Student> earlyBirds=new ArrayList<>();// grade:A
        ArrayList<Student> angryBirds=new ArrayList<>();


        for (Student student:students){
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);





    }
}
