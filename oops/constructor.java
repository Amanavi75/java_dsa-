package oops;

public class constructor {
     public static class person {
        int age ;
        String name ;
        void sayhii() {
            System.out.println(name + " "+age + " says hii");

        }
        person(){
            // this is default constructor made by java 
        }
        person(int age , String name ){ // parameterized constructor ; same name as function  it is called when we fire it with a constructor and java will remove its default constructor when any paramatrized constructor is created 
             
            this.age =age ;
            this.name= name ;
        }
     }
     public static void main(String[] args){
        person p1 =new person();
        p1.age =14;
        p1.name ="vivek";
        p1.sayhii();

        person p2 =new person(16,"aman"); // calling parametrized constructor 
        p2.sayhii();

     }
}
