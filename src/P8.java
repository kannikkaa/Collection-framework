class Employee {
    private String name;
    private int id;
    private int salary;
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    String getName() {
        return name;
    }
    int getId() {
        return id;
    }
    int getSalary() {
        return salary;
    }
    String getDetail() {
        return "name: " + name + " id: " + id + " salary: " + salary;
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    String  getDetail(){
        return super.getDetail()+" teamSize: "+teamSize;
    }
    }
    public class P8 {
        public static void main(String[] args) {
Manager m1 = new Manager("ramesh", 1001, 100000, 20);
            System.out.println(m1.getDetail());
        }
}
