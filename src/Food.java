import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    public void foodlist() {    // Food list method
        ArrayList<String> foodlist = new ArrayList<String>();

        foodlist.add("1.Potato");
        foodlist.add("2.Tomato");
        foodlist.add("3.Cocamber");
        foodlist.add("4.Meat");

        System.out.print("You are in Food list:\nOur list is\n");
        for (String i: foodlist ){System.out.println(i);}
        Scanner in = new Scanner(System.in);
        System.out.print("Please Choose Type Food:");
        int digit = in.nextInt();
        System.out.println(foodlist.get(digit-1));

        System.out.println("How many males do you want ?");
        Scanner ordering = new Scanner(System.in);
        int nu = ordering.nextInt();
        Order newOrder =new Order(foodlist.get(digit-1) ,nu,5);

    }
}
