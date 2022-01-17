package day39_Recap.shape;

public class Shape {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
      return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +

                "name='" + name + '\'' +
                '}';
    }
}
