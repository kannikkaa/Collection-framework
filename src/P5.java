class Person {
private String name;
private int age;
public Person(String name, int age){
this.name = name;
this.age = age;
}
}
class Studenta extends Person {
 private int rollNumber;
 private int marks;
 public Studenta(String name, int age, int rollNumber, int marks){
     super(name, age);
     this.rollNumber = rollNumber;
     this.marks = marks;
 }
 public int getRollNumber(){
     return rollNumber;
 }
 public int getMarks(){
     return marks;
 }
}
    public class P5 {
        public static void main(String[] args) {
Studenta s1 = new Studenta("kanika", 24, 15, 100);
            System.out.println(s1.getRollNumber());
            System.out.println(s1.getMarks());
        }
    }


