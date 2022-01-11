package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1=new Tester("sueda",2321,"QA",150000);
        Tester tester2=new Tester("ayse",2361,"QA",123000);
        Tester tester3=new Tester("hulya",2378,"SE",134000);
        Tester tester4=new Tester("akin",2301,"SDET",150100);
        Tester[] testers={tester2,tester3,tester4};

        Developer developer1=new Developer("olga",2772,"java developer",10005);
        Developer developer2=new Developer("anna",7772,"java master",19895);
        Developer developer3=new Developer("ahmet",23332,"java developer",178985);
        Developer developer4=new Developer("emin",24442,"java junior",10000);
        Developer developer5=new Developer("hulya",2772,"software developer",16775);
        Developer[] developers={developer1,developer3,developer3};

        ScrumTeam scrum=new ScrumTeam("muhtar","asiya","neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer2);






        System.out.println(scrum);




    }


}
