import java.util.Scanner;

class CoffeeHouse{
    public static void main(String[] args) {
       
        
     System.out.println(" COFFEE MENU");  
     System.out.println("espresso"); 
      System.out.println("cappuccino:");
      System.out.println("latte:");
         System.out.println("Add-Ons in espresso");{
     System.out.println("milk: 60"); 
      System.out.println("cream: 75"); 
        System.out.println("latte: 100");
        }
       
           System.out.println("Add-Ons in cappuccino");{
        System.out.println("milk: 80"); 
        System.out.println("cream: 90"); 
        System.out.println("latte: 125"); 
        }
      
           System.out.println("Add-Ons in latte");{
        System.out.println("milk: 100"); 
        System.out.println("cream: 125"); 
        System.out.println("latte: 150");
        }
        Scanner scan =new Scanner(System.in);
         System.out.println("Enter the Price");
         double coffeePrice=scan.nextDouble();
         double tax=(0.05)*coffeePrice;
         double tip=(coffeePrice+tax)*(0.12);
         double totalbill=coffeePrice+tax+tip;
         System.out.println("coffeePrice"+coffeePrice);
          System.out.println("tax"+tax);
          System.out.println("tip"+tip);
            System.out.println("totalbill"+totalbill);
}
}
