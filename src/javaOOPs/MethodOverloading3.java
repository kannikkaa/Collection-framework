package javaOOPs;

public class MethodOverloading3 {
    public static void sendMessage(String phoneNum){
        System.out.println("Sending SMS to: "+phoneNum);
    }
    public static void sendMessage(String mailAddress, String subject){
        System.out.println(mailAddress+ subject);
    }
    public static void sendMessage(String subject1, String phoneNum1, String media){
        System.out.println(subject1 +phoneNum1+" with "+ media);
    }

    public static void main(String[] args) {
        sendMessage("8302299010");
        sendMessage("Kanikachhipa111@gmail.com", "What are you doing?");
        sendMessage("Sending message to: ","98282151899", "photo.jpg");
    }
}
