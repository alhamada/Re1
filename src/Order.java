import java.util.Scanner;

public class Order {
    String name ;
    int numberOfOrders ;
    int price;


    Order (String name , int numberOfOrders , int price){
        this.name=name;
        this.numberOfOrders=numberOfOrders;
        this.price=price;
        System.out.println("You ordered "+this.name +" "+ this.numberOfOrders+ " and its price is"+this.price*this.numberOfOrders);
    }

}
