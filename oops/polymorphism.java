package oops;
class Student  {
    String name;
    int age ;


    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age ){
        System.out.println(name+ " "+age);
    }
}
// function with same in same class but along with some differentiating factor like difference in parameter aur return , this is known function overloading  also known as compile time polymorphism .
public class polymorphism {
    public static void main (String args[]){
        Student s1 = new Student();
        s1.name="aman";
        s1.age = 22;

        s1.printinfo(s1.age);
    }
   

}
