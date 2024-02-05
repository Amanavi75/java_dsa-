@FunctionalInterface 
//* when we create the single method inside the interface that is known as functional interface  */
interface Hotel {
    public void order();
}
public class lambda {
    public static void main(String args[]){
        String item = "tea";
        Hotel H1 = ()->{
            System.out.println("My order is :- " + item);
        };

        H1.order();
    }
}
