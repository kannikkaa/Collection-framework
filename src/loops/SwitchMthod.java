package loops;

public class SwitchMthod {
    public static String getDay(int day) {
        switch (day) {
            case 1:
                return "monday";
            case 2:
                return "tuesday";
            case 3:
                return "wednesday";
            default:
                return "unknown";
        }
    }

    public static void main(String[] args) {
        //int day = 3;//defining th input
        // String a = getDay(day);//calling the method
        //when dont want to defineinput then directly put the input value while calling the method
        String a = getDay(3);
        System.out.println(a);
    }
}


