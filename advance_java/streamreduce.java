import java.util.*;
import java.util.stream.*;
class home {
    String name;
    int quantity;
    float  cost;

    home(String name,int quantity,float  cost){
        this.name = name;
        this.cost = cost ;
        this.quantity = quantity;
    }
}

public class reduce{
    public static void main (String args[]){
        ArrayList<home> al = new ArrayList<>();
        al.add(new home("washing Machine ", 1,16000));
        al.add(new home("heater ", 1,15000));
        al.add(new home("refrigerator", 1,14000));
        al.add(new home("ac", 1,13000));

        Stream<home>str= al.stream();

       float budget  = str.map(product->product.cost).reduce(0.0f,(sum,cost)->sum+cost);

       System.out.println("total cost is budget"+ budget);
    }
}
