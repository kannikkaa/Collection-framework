package exceptionHandling;
class ATM {
    public static void withdraw(int amount) throws Exception {
        if (amount > 5000) {
            throw new Exception("Amount exceeds limit.");
        }
        System.out.println("Withdrawn: " + amount);
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        try {
            ATM.withdraw(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
