package loops;

import java.util.Scanner;
//when we use return(it means, "exit this method and give back a value) & cant use return inside main() unless returning from it.
public class SwitchMthd2 {
    //using the variable that he user gave, in input of the method
   public static String getRestaurantName(String restaurant){
        switch(restaurant) {
            //when we use string type= " ",  int type = no quotes, nothing, char data type = ' '
           case "masalatrails":
                return "Let's go to masala trails";
            case "tandooritales":
                return "Let's go to tandoori tales";
            case "rotirasoi":
                 return "Let's go to roti rasoi";
            default:
                return "going nowhere";
                //when we use sout instead of return then use break so that it doesnt print the next cases in console
           // case 'msalatrails" -> System.out.println("Let's go to masala trails");
        }
    }
    public static void main(String[] args) {
       //taking input from the user
        Scanner sc = new Scanner(System.in);
        //putting it in restaurant variable
        String restaurant = sc.nextLine();
        String res =  getRestaurantName(restaurant);
        System.out.println(res);


    }
}
