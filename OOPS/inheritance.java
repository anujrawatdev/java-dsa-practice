package OOPS;

//Base class or parent class.
class shape{
    String color;

}

//Triangle class inherited the properties of shape class.

//This class called sub class or child class.
class Triangle extends shape{
public void area(int l,int h){
    System.out.println(1/2*l*h);
}
}

class Circle extends shape{
    public void area(int r){
    System.out.println((3.14)*r*r);
}
}

public interface inheritance {
    public static void main(String args[]){
         Triangle t1= new Triangle();
         t1.color = "red";
    }
}
