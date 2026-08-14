package OOPS;

// abstract class Animal{
//  abstract void walk();
//  Animal(){ 
//     System.out.print("you are creating a new constructor");
// }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }

// class Horse extends Animal{
//      Horse(){ 
//     System.out.print(" creating a new Horse");
// }
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }


//Pure abstraction by Interfaces
interface Animal {
    int eyes =2;
    void walk();
} 

class Horse implements Animal {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class encapsulation {
    public static void main(String args[]){
       Horse horse = new Horse();
       horse.walk();
    }
}
