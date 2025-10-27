class Box<T> {
T value;


    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
    public class Generics {
        public static void main(String[] args) {
            Box<String> strbox = new Box<>();
            strbox.set("kanika chhipa");
            System.out.println(strbox.get());
            Box<Integer> intbox = new Box<>();
            intbox.set(100);
            System.out.println(intbox.get());
            }
        }


