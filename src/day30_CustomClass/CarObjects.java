package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("toyota", "cambry", "red", 2020, 35000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("bmv", "x5", "black", 2022, 550000);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("audi","q5","white",2021,60000);
        System.out.println(car3);

//Car[] cars={car1,car2,car3};
        ArrayList<Car> carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        for (Car each :carsList){
            System.out.println(each.brand + ":" + each.price);
        }
        System.out.println("=============================================================================");

        /*
        recall:
        BMV:2005-2008
        Toyota:2022-1992.
         */


        carsList.removeIf(p->p.brand.equals("BMW") && p.year >=2005 &&p.year<=2008);
        carsList.removeIf(p->p.brand.equals("toyota")&& p.year>=2022 && p.year<=1992);







    }



}
