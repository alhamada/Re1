import java.util.ArrayList;
import java.util.Scanner;

public class Welcome {
    public  void welcomemethod(){
            System.out.println("\nWelcome to \nMiddle See Restaurant, \nSo Please Select Which species Would you like to Eat:\n");
    ArrayList<String> species = new ArrayList<String>();
        species.add("1.Foods");
        species.add("2.Drinks");
        species.add("3.Desserts");

        for (String i : species) { System.out.println(i); }
        System.out.println("\n\nWe Have only these " +species.size()+" species in our Restaurant ");
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Type of species: ");
        int digit = in.nextInt();
        if (digit==1 ){
            Food select =new Food();
            select.foodlist();
        }
        else if (digit==2){
            Drink drinklist = new Drink();
            drinklist.drink();

        }
        else if (digit==3){
            Desserts dessertslist = new Desserts();
            dessertslist.desserts();
        }

    }
}
