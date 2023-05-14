package oops;
class shape {
    String color;
    public void  area(){
        System.out.println("display area ");
    }
}
class Triangle extends shape { 
    public void area (int l , int h){
        System.out.println(1/2*l*h);
    }
}
// extends keyword is used to inherit the properties of existing clas  


public class inheritance {
    public static void main(String args[]){
        Triangle  T1= new Triangle();
        T1.color ="red"; 

        T1.area(12,16);
    }
    // inheriting the property of shape class
}
