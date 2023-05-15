//abstraction is hiding the implementation details and showing important/useful parts to the user  

// abstraction class can have constructors and static method 

package oops;
abstract class Animal { 
// creating the abstract class using abstract keyword 

//  we can not create the objict of abstract class 
// if we try to crate it will give us the runtyme error 

    abstract void  walk();
    Animal(){
        System.out.println("you are creating an constructor ");
    }
    public void eat(){
        System.out.println("Animals eat");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("created a horse ");
    }
    public void walk(){
        System.out.println("walks on 4 legs ");
    }
}class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs ");
    }
}

public class abstraction {
    public static void main (String args []){
        Horse aditya = new Horse();
        aditya.walk();
    } 
}


