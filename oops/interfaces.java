package oops;
interface Animal { // interfaces doesnot have constructor 
    void walk();
    
}
// emplement keyword is used for the interfaces 
// all the fields in interfaces are  public static and final by default amd also abstract by default 

// a class that implement an interfaces must implement the all the method declared  in interfaces 

// supports the functionality of multiple inheritance

interface Herbivore {

}
class Horse implements Animal , Herbivore{ 
    // implementing multiple inheritance using interfaces 
    public void walk(){
        System.out.println("walk on four legs");
    }
}

public class interfces {
    public static void main (String args []){
        Horse horse = new Horse();
        horse.walk();
    }
}
