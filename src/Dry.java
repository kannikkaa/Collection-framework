public class Dry {
    public static void printReport(String name, int[] marks) {
        System.out.println("Printing report for: " + name);
        int total = calculateTotal(marks);
        double average = total / (double) marks.length;
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + getGrade(average));
    }

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static String getGrade(double average) {
        if (average >= 90) return "javaOOPs.A+";
        else if (average >= 80) return "javaOOPs.A";
        else if (average >= 70) return "javaOOPs.B";
        else if (average >= 60) return "javaOOPs.C";
        else return "failed";
    }

    public static void main(String[] args) {
        String[] names = {"kanika", "mayank", "khushi"};
        int[][] marks = {
                {87, 98, 76}, {84, 75, 79}, {68, 79, 65}
        };
        for (int i = 0; i < names.length; i++){
            printReport(names[i], marks[i]);
        }
    }
}