package oops;

public class classobjects {
    public static class person {  // creating a class person 
        int age; // declaring age  and name as data member 
        String name ;

        void sayshi(){ //  
            System.out.println(name + " "+ age + " says hii");
        }
        public static void main (String args []){
            person p1 = new person(); // creating an object p1 
            p1.age=10; // assining values to data member 
            p1.name="aman";
            p1.sayshi(); // calling function with reference to object 

        }
       
    } 
}
