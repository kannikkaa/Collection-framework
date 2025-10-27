public class method1prac {
    //here subjTotal is jus a local variable that we defined in the method, it doesnt exist outside this method
    public static float getPercentage(int subjTotal){
        return subjTotal/200.0f*100;
    }
    public static void main(String[] args) {
        String student1 = "kanika";
       int maths = 87;
       int eng = 96;
       //to call the method, we use variables and for using them, we have to first initialize(putting some value) them.
        int subjTotal1 = maths + eng;
        String student2 = "mayank";
        int maths1 = 76;
        int eng1 = 84;
      int subjTotal2 = maths1 +eng1;
      //we can use multiple variables to call the getPercentage method
        System.out.println(student1 +" got "+ getPercentage(subjTotal1) +"%");
//System.out.println(student2 +" got "+ getPercentage(subjTotal2) +"%");
        float result = getPercentage(subjTotal2);
        System.out.println(result);

    }
}
