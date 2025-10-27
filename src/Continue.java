public class Continue {
    //continue means Skip the rest of the current iteration and go to the next round of the loop
    public static void main(String[] args) {
       /* for(int i=1; i<=5; i++){
            if(i==3){
                System.out.println("bye");
                continue;
            }
            System.out.println(i+" hi");
        }*/
       int n=4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
