class Car {
String modelType;
int modelYear;
int speed;
//here modeltype, modelyear, speed are the attributes of  an object so made constructor, with its help will make object
Car(String modelType, int modelYear, int speed){
   this.modelType = modelType;
   this.modelYear= modelYear;
   this.speed = speed;
}
void display(){
    System.out.println("my car model is "+modelType+" it was released in "+modelYear+" its speed is "+speed);
}
}
    public class P4 {
    public static void main(String[] args) {
Car myCar = new Car("honda", 2022, 100);
myCar.display();
    }
}
