package loops;

public class if_else { int marks = 87;
    public static String getGrade ( int marks){
        if (marks >= 90) return "javaOOPs.A+";
        if (marks >= 80) return "javaOOPs.A";
        return "fail";
    }

    public static void main(String[] args) {
       /* int marks = 89;
        if(marks>=90){
            System.out.println("javaOOPs.A+");
        }
        else if(marks>=80){
            System.out.println("javaOOPs.A");
        }
        else if(marks >=70){
            System.out.println("javaOOPs.B");
        }
        else if(marks >= 60){
            System.out.println("javaOOPs.C");
        }
        else{
            System.out.println("Failed");
        }*/
        // use return type after creating getGrade() method
     String a = getGrade(87);
        System.out.println(a);
    }
}