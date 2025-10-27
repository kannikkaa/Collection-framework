package javaOOPs;

class Book {
String title;
int pages;
//here i made a constructor so that i can put some parameters in it and i wont have to declare variables after creating object in main method
public Book(String bookTitle,  int bookPages) {
    //using this. to show that the parameters are those variables
    this.title = bookTitle;
    this.pages = bookPages;
}
public String getTitle(){
    return title;
}
public int getPages(){
    return pages;
}
}
public class Constructors {
    public static void main(String[] args) {
        Book b1 = new Book("Aladdin", 250);
        System.out.println("Name of the book is "+b1.getTitle()+" and number of pages in this book is "+b1.getPages());
    }
    }
    //when u want to put some parameters(attributes) make constructOR not simple object, it initializes it there only



