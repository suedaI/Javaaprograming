package day35_Encapsulation;

public class CydeoStudent {

   public String name;
   public char gender;
   public int age;
   public int batchNumber,groupNumber;
   public static String schoolName,programmingLanguage;
   public String fieldOfStudy;
   public static String secretCode;


   public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
      this.name = name;
      this.gender = gender;
      this.age = age;
      this.batchNumber = batchNumber;
      this.groupNumber = groupNumber;
      this.fieldOfStudy = fieldOfStudy;
   }

   static {
      schoolName="Cydeo";
      programmingLanguage="java";
      secretCode="wooden spoon";
   }
   public static void printSchoolName(){
      System.out.println("school name is "+schoolName);
   }
   public static void printPrograminngLanguage(){
      System.out.println("proggramming language is "+programmingLanguage);
   }
   public void attendClass(){
      System.out.println(name +" is attending class");
   }
   public void study(){
      System.out.println(name+" is studying");
   }

   public String toString() {
      return "CydeoStudent{" +
              "name='" + name + '\'' +
              ", gender=" + gender +
              ", age=" + age +
              ", batchNumber=" + batchNumber +
              ", groupNumber=" + groupNumber +
              ", fieldOfStudy='" + fieldOfStudy + '\'' +
              ", school=" + schoolName +
              '}';
   }
}
