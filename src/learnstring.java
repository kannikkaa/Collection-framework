public class learnstring {
    public static void main(String[] args) {
        String name = " kanika ";
        int len = name.length();
        System.out.println(len);
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        //here string is not changed but it created a new string of kanika chhipa
        String s = "kanika";
        s = s + " chhipa";
        System.out.println(s);
        //trim removes the extra spaces from  front and from end
        System.out.println(name.trim());
        //print a new string from 2nd index, each space also counts as a index, index starts with 0
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace('a', 'm'));
        System.out.println(name.replace("an", "ma"));
        System.out.println(name.startsWith(" kan"));
        System.out.println(name.endsWith("ika "));
        System.out.println(name.charAt(3));
        //return the index at which it comes at
        System.out.println(name.indexOf("an"));
        //search from ndex 2
        System.out.println(name.indexOf("an", 2));
        //STRING IS CASE SESITIVE, equals method always return true or false
        System.out.println(name.equals(" KANIKA "));
        System.out.println(name.equalsIgnoreCase(" KANIKA "));
        //to use double quote in code
        System.out.println("hello, \"kanika\" ");
        System.out.println("hello, \'kanika\' ");
        //new line
        System.out.println("hello, \nkanika ");
        System.out.println("hello, \\kanika");

    }
}
