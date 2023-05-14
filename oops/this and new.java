package oops;

class pen {   // creating class 
 String color;
 String type ; // ball or grl  point 


 public void write (){ // this is called method 
    System.out.println("writing something ");
 }

 public void printcolor(){
    System.out.println(this.color); // it use give the reference to the objects 
 }
}
public class oopssecond {
   public static void main (String args []){
    pen pen1 = new pen(); // creating an object pen1 with different properties 
    pen1.color="blue";
    pen1.type="gel";


    pen pen2= new pen(); //  creating an object pen2 with different properties 
    pen2.color="red";
    pen2.type="ball";

    pen1.write();
    pen2.write();


    System.out.println(pen2.color); // we can access it like this 
    System.out.println(pen1.color);
    System.out.println(pen2.type);
    System.out.println(pen1.type);

   } 
   
}
