class Library {
    int availableBooks;
    public void showAvailableBooks(){
        System.out.println("available books are "+availableBooks);
    }

    public void addBooks(int addedBooks){
        availableBooks += addedBooks;
        System.out.println("after adding books, available books are "+availableBooks);

    }
public  void issueBook(int issuedBooks){
        availableBooks -= issuedBooks;
    System.out.println("issuing books "+availableBooks);
}

public void returnBook(int returnedBooks){
        availableBooks += returnedBooks;
    System.out.println("returning books "+availableBooks);

}
}
public class prat {
        public static void main(String[] args) {
Library centralLibrary = new Library();
centralLibrary.addBooks(10);
centralLibrary.showAvailableBooks();
centralLibrary.addBooks(5);
centralLibrary.issueBook(4);
centralLibrary.returnBook(3);
            System.out.println("balance after day end: "+centralLibrary.availableBooks);
    }
}
