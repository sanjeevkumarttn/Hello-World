package Java2;

// 1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.


//package Java2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        Librarian l1 = new Librarian();
        do {
            System.out.print("\n0. Exit | 1. Add | 2. View Book Records | 3. Search | 4. Delete | 5. Isuue | 6. Return Book | 7. View Borrowe List \nEnter your choice: ");
            choice = scan.nextInt();
            String temp = scan.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    l1.addBook();
                    break;
                case 2:
                    l1.showBook();
                    break;
                case 3:
                    l1.searchBook();
                    break;
                case 4:
                    System.out.print("Enter Book_Id to Delete: ");
                    int deleteBookId = scan.nextInt();
                    temp = scan.nextLine();
                    l1.deleteBook(deleteBookId);
                    break;
                case 5:
                    l1.issueBook();
                    break;
                case 6:
                    try {
                        l1.returnBook();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    if (l1.readerCounter > 0) {
                        for (int i = 0; i < l1.readerCounter; i++) {
                            System.out.println("Reader_Id: " + l1.readers[i].readerId + " | Reader_Name: " + l1.readers[i].readerName + " | Book_Id: " + l1.readers[i].bId);
                        }
                    }
                    break;
                default:
                    System.out.println("Please choose a valid input...\n");
            }
        } while (choice != 0);

    }

}


class Book {
    int bookId;
    String bookName;
    String author;
    String bookType;
    static int bookCounter;
    Book[] books = new Book[20];

    Scanner sc = new Scanner(System.in);

    public void showBook() {
        if ((bookCounter >= 0)) {
            for (int i = 0; i < bookCounter; i++) {
                System.out.println("Book_Id: " + books[i].bookId + " | Book_Name: " + books[i].bookName + " | Author: " + books[i].author + " | Book_Type: " + books[i].bookType);//+" | Quantity: "+quantity);

            }
        } else {
            System.out.println("There is no book....");
        }
    }


    // helper function of searchBook and deleteBook
    public int bookFound(int id) {
        for (int i = 0; i < bookCounter; i++) {
            if (books[i].bookId == id)
                return i;
        }
        return -1;
    }


    public void searchBook() {
        System.out.print("Enter Book_Id to search: ");
        int bookId = sc.nextInt();
        int found = bookFound(bookId);
        if (found >= 0) {
            System.out.println("Book is available...");
            System.out.println("Book_Id: " + books[found].bookId + " | Book_Name: " + books[found].bookName + " | Author: " + books[found].author + " | Book_Type: " + books[found].bookType);//+" | Quantity: "+quantity);

        }
    }

}

class Librarian extends Book {
    static int readerCounter;
    int librarianId = 111;
    String librarianName = "XYZ";
    Reader[] readers = new Reader[20];
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date dateInstance = new Date();


    public void addBook() {
        books[bookCounter] = new Book();
        System.out.print("Enter Book_Id: ");
        int id = bookId = sc.nextInt();
        if (bookFound(id) < 0) {
            books[bookCounter].bookId = id;
            String temp = sc.nextLine();
            System.out.print("Enter Book_Name: ");
            books[bookCounter].bookName = sc.nextLine();
            System.out.print("Enter Author Name: ");
            books[bookCounter].author = sc.nextLine();
            System.out.print("Enter Book_Type: ");
            books[bookCounter].bookType = sc.next();
            System.out.print("Quantity: ");
            System.out.println("Book added successfully....\n");
            bookCounter++;
        } else
            System.out.println("Book_Id already exist....");

    }


    public void deleteBook(int deleteBookId) {

        int found = bookFound(deleteBookId);
        if (found >= 0) {

            if (found < bookCounter - 1) {
                for (int i = found; i < bookCounter - 1; i++) {
                    books[i].bookId = books[i + 1].bookId;
                    books[i].bookName = books[i + 1].bookName;
                    books[i].author = books[i + 1].author;
                    books[i].bookType = books[i + 1].bookType;
                }

            }
            System.out.println("Book_Id: " + deleteBookId + " deleted from book list successfully...\n");
            bookCounter--;
        } else
            System.out.println("\nSorry Entered Book_Id is not found....\n");
    }

    public void issueBook() {
        readers[readerCounter] = new Reader();
        System.out.print("Enter Book Id to be Issue: ");
        int bId = sc.nextInt();
        String temp = sc.nextLine();
        int bookFoundIndex = bookFound(bId);
        if (bookFoundIndex >= 0) {
            readers[readerCounter].bId = bId;
            System.out.print("Enter Reader Name: ");
            readers[readerCounter].readerName = sc.nextLine();
            System.out.print("Enter Reader Id: ");
            readers[readerCounter].readerId = sc.nextInt();
            temp = sc.nextLine();
            readers[readerCounter].date = dateFormat.format(dateInstance);
            readers[readerCounter].bName = books[bookFoundIndex].bookName;
            readers[readerCounter].bAuthor = books[bookFoundIndex].author;
            readers[readerCounter].bType = books[bookFoundIndex].bookType;
            readerCounter++;
            deleteBook(bId);
            System.out.println("\nBook Issued Successfully....\n");
        } else
            System.out.println("Entered Book_Id is not available...");
    }

    public void returnBook() throws CloneNotSupportedException {
        boolean isIssued = false;
        System.out.print("Enter Book Id: ");
        int bId = sc.nextInt();
        String temp = sc.nextLine();
        int i;
        for (i = 0; i < readerCounter; i++) {
            if (readers[i].bId == bId) {
                isIssued = true;
                break;
            }
        }

        if (isIssued) {
            books[bookCounter] = new Book();
            books[bookCounter].bookId = readers[i].bId;
            books[bookCounter].bookName = readers[i].bName;
            books[bookCounter].author = readers[i].bAuthor;
            books[bookCounter].bookType = readers[i].bType;
            bookCounter++;
            if (readerCounter == 1) {
                readerCounter = 0;
            } else {
                for (int j = i - 1; j < readerCounter; j++) {
                    readers[j] = (Reader) readers[j + 1].clone();
                }
                readerCounter--;
            }
        } else
            System.out.println("\nEntered Book_Id is not issued to anyone...\n");
    }
}


class Reader extends Book implements Cloneable {

    int readerId;
    String readerName;
    String date;
    int bId;
    String bName;
    String bAuthor;
    String bType;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}