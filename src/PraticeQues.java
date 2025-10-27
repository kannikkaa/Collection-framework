public class PraticeQues {
    public static void main(String[] args) {
        //CONVERT STRING INTO LOWER CASE
        String name = "Mayank namdev";
        String a = name.toLowerCase();
        System.out.println(a);
        //replace spaces with underscors
        System.out.println(name.replace(' ', '_'));
        //write this template
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "kanika"));
        //format the letter2
        String letter2 = "Dear Harry, This Java Course is nice. Thanks";
        System.out.println("Dear Harry, \n\tThis Java Course is nice. \nThanks");
        String letter3 = "Hey kanika,  you are the best,   thank you";
        System.out.println(letter3.indexOf("  "));
        System.out.println(letter3.indexOf("   ")); //if u write the triple space first then double space ten it will tell the same index bec double falls on triple ones index first
        //ques
        int m = 10;
        if(m == 11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }







    }


    }

