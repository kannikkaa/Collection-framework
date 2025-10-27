class StorageBox<T> {
T item;
   public void storeItem(T item){
       this.item = item;
   }
    T retrieveItem(){
       return item;
    }

}
    public class Generics2 {
    public static void main(String[] args) {
        StorageBox<String> box1 = new StorageBox<>();
        box1.storeItem("LED Bulbs");
        System.out.println("type of items stored is:"+box1.retrieveItem());

        StorageBox<Integer> box2 = new StorageBox<>();
        box2.storeItem(50);
        System.out.println("no. of items stored is: "+box2.retrieveItem());

        StorageBox<Double> box3 = new StorageBox<>();
        box3.storeItem(4.5);
        System.out.println("weight of boxes is: "+box3.retrieveItem());

    }
}
