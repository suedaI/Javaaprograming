package day36_Inheritance.encapsulation;


  public class student {

        private String name;
        private int age;
        private char gender;
        private char grade;
        private static String schoolName;

        static {
            schoolName="Cydeo";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age<5 || age>90){
                return;
            }
            this.age = age;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            if (!(gender=='F' || gender=='M')){
                return;
            }
            this.gender = gender;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            if (!(grade=='A'|| grade=='B'||grade=='C'|| grade=='D'||grade=='F')){
                return;
            }
            this.grade = grade;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            student.schoolName = schoolName;
        }
        public void study (){
            System.out.println(name + " study in ");

        }

      public student(String name, int age, char gender, char grade) {
        setName(name);
         setGender(gender);
        setGrade(grade);
         setAge(age);
      }

      public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", grade=" + grade +

                    '}';
        }
    }


