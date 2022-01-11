package day10_NestedIf;

import javax.management.MBeanAttributeInfo;

public class GradeReport2 {
    public static void main(String[] args) {

        int s =67;
        String result= (s >= 0 && s <= 100 )? (s>=90)? "excellent" :(s>=80)? "great"
                :(s>=70)? "good" :(s>=60)?"pass" :"faild" :"Invaild score";

        System.out.println(result);


    }
}
