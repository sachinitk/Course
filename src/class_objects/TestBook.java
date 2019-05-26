package class_objects;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book name:");
        String bookName = scanner.nextLine();
        System.out.println("Enter the price:");
        int bookPrice = scanner.nextInt();
        System.out.println("Enter the Author name:");
        scanner.nextLine();
        String authorName = scanner.nextLine();
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthorName(authorName);
        book.setBookPrice(bookPrice);
        System.out.println("Book Name:"+book.getBookName());
        System.out.println("Book Price:"+book.getBookPrice());
        System.out.println("Author Name:"+book.getAuthorName());

    }
}
