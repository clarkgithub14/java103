/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering_system;

/**
 *
 * @author User
 */
 import java.util.Scanner;
public class Ordering_System {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
         Scanner order = new Scanner(System.in);
  int Order;
  
             System.out.println("Menu");
             System.out.println("#0  Fishball W/ Drinks ");
             System.out.println("#1  Iced Choco");
             System.out.println("#2  Double Minute Burger ");
             System.out.println("#3  Black Pepper Minute Burger");
             System.out.println("#4  Nachos W/Carne ");
             
             System.out.println("Choose Number to Order:");
             
             Order=order.nextInt();
             
             
             switch (Order){
             
                 case 0:
                     System.out.println("YOUR ORDER IS : Fishball W/ Drinks Php. 10");
                     break;
                 case 1:
                     System.out.println("YOUR ORDER IS : Iced Choco Php. 20");
                     break;
                 case 2:
                     System.out.println(" YOUR ORDER IS : Double Minute Burger Php. 65");
                     break;
                 case 3:
                     System.out.println("YOUR ORDER IS :  Black Pepper Minute Burger Php. 85");
                     break;
                 case 4:
                     System.out.println("YOUR ORDER IS : Nachos W/Carne Php. 35");
                     break;
                 default:
                     System.out.println("Invalid Number");

    }
    
}

}