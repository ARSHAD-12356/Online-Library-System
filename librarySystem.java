// * Problem Statement:---
/*
 * You have to implement a library using java class Library
 * Methods: Issue book , returnBook,addBook,showAilableBooks
 * Properties:-- Array to store the avilable books
 * Array to store the issued book
 * 
 */

import java.util.Scanner;

class library{
   String[] books;
   int no_of_books;
  library(){
   this.books = new String[100];
   this.no_of_books=0;
  }

  void addBook(String book){
   this.books[no_of_books]=book;
   no_of_books++;
   // System.out.println(book + " has been added!");
  }

  void showAilableBooks(){
   System.out.println("Avilable Books are:");
   for (String book : this.books) {
      if (book == null) {
         continue;
      }
      System.out.println("* " + book);
   }
  }
  void issueBook(String book){
   for (int i=0; i<this.books.length; i++) {
      if (this.books[i].equals(book)) {
         System.out.println("The " + book + " book has been issued!");
         this.books[i] = null;
         return;
      }
   }
   System.out.println("This book does not exist");
  }

  void returnBook(String book){
   addBook(book);
   }
   
  }

public class librarySystem {
    public static void main(String[] args) {
      // System.out.println("Enter which book would you like to add?");
      String user;
      Scanner sc = new Scanner(System.in);
      library centralLibrary = new library();
      System.out.println("---Welcome To The Online Library Application--");
      centralLibrary.addBook("Think and grow Rich");
      centralLibrary.addBook("Algorithms");
      centralLibrary.addBook("C++");
      centralLibrary.showAilableBooks();
      System.out.println("Do you want to add some books? Type 'yes' or 'no'");
      user = sc.nextLine();
      if(user.equals("yes")) {
         System.out.println("Enter the name of the book:");
         String book = sc.nextLine();
         centralLibrary.addBook(book);
      } else if(user.equals("no")) {
         System.out.println("Hope you'll add later");
      }
      System.out.println("Do you want to see Avilable books? Type 'yes' or 'no'");
      user = sc.nextLine();
      if(user.equals("yes")) {
         centralLibrary.showAilableBooks();
      } else if(user.equals("no")) {
         System.out.println("Have a good day!");
      }
      System.out.println("Do you want to issue any book? Type 'yes' or 'no'");
      user = sc.nextLine();
      if(user.equals("yes")) {
         System.out.println("Enter book name to be issue?");
         String book = sc.nextLine();
         centralLibrary.issueBook(book);
      } else if(user.equals("no")){
         System.out.println("Keep learning! and keep sploring");
      }
      System.out.println("Do you want to see Avilable books? Type 'yes' or 'no'");
      user = sc.nextLine();
      if(user.equals("yes")) {
         centralLibrary.showAilableBooks();
      } else if(user.equals("no")) {
         System.out.println("Have a good day!");
      }
      // centralLibrary.showAilableBooks();
      System.out.println("Do you want to return any book? Type 'yes' or 'no' " );
      user=sc.nextLine();
      if(user.equals("yes")) {
         System.out.println("Enter book name to be return?");
         String book = sc.nextLine();
         centralLibrary.returnBook(book);
      } else{
         System.out.println("ok");
      }
      System.out.println("Do you want to see Avilable books? Type 'yes' or 'no'");
      user = sc.nextLine();
      if(user.equals("yes")) {
         centralLibrary.showAilableBooks();
      } else if(user.equals("no")) {
         System.out.println("Have a good day!");
      }
    }
}
