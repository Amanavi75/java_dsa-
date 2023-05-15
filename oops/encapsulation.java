// in case of encaplsulation we can use the another package property in this package by importing it here only 
 // combining the data and entity in same function  

// access modifiers is used to encapsulate this 
// that is public ,private, protected and default

// public->>>can be accesed by anyone in any package or in any class 

// default->> only accessible in same package 

// protected ->> we can access in same package but in another package only sub class can access it 


// private ->> only accessible in class 

package oops;
class Account {
    public String name ;
    protected String email;
    private String password;

    // to access the private function we use getters and setters 

    public String getpassword(){ // creating getters 
        return this.password;

    }
    public void setpassword(String pass){ // creating setters 
          this.password= pass;
    }


}
 public class encapsulation {
    public static void main (String args []){
        Account account1 = new Account();
        account1.name =" aman";
        account1.email = " amanavi75@gmail.com";
        account1.setpassword("amanavi"); 
        
        // accessing the private properties or action  using gtters and setters

        System.out.println(account1.getpassword());


    }
 }
