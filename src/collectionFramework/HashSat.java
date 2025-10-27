package collectionFramework;
import java.util.HashSet;
import java.util.Objects;


        class Student {
            int id;
            String name;

            // Constructor
            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            // Override equals() to compare students by ID only
            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;

                if (obj == null || getClass() != obj.getClass())
                    return false;

                Student s = (Student) obj;
                return this.id == s.id;
            }

            // Override hashCode() to use the id field
            @Override
            public int hashCode() {
                return Objects.hash(id); // or simply: return id;
            }

           @Override
            public String toString() {//toString() by default prints ClassName and hash code
                return "Student{id=" + id + ", name='" + name + "'}";//so we r giving this customized format to it
            }
        }

        public class HashSat {
            public static void main(String[] args) {
                HashSet<Student> set = new HashSet<>();

                Student s1 = new Student(101, "Alice");
                Student s2 = new Student(101, "Bob");     // Same id as s1 → should be considered duplicate
                Student s3 = new Student(102, "Charlie"); // Unique id

                set.add(s1);
                set.add(s2); // Will not be added if equals() and hashCode() are correctly overridden
                set.add(s3);

                for (Student s : set) {
                    System.out.println(s);//this method internally calls toString()
                }












    }




}



