class Student2 {
    String name;
    int age= 24;
     void setName(String name) {
        this.name = name;
    }
    String getName(){
             return name;
        }
        void setAge(int age){
         this.age = age;
     }
     int getAge(){
         return age;
     }
}

public class P3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
       s1.name = "kanika";
       s1.age= 24;
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
