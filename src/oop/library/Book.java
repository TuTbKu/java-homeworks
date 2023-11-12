package oop.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String author;
    private String nameOfBook;
    private int id;
    private String category;
    private ArrayList<Integer> ratings = new ArrayList<>();
    int rating;
    int ratingPosition;

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public String getAutor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantityOfBook() {
        return quantityOfBook;
    }

    private int quantityOfBook;

    public void setAutor(String autor) {
        this.author = autor;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantityOfBook(int quantityOfBook) {
        this.quantityOfBook = quantityOfBook;
    }

    public void display() {
        System.out.println("Автор книги: ' " + author + "' | Идентификатор Книги:" + id + "| " +
                "Название книги: " + nameOfBook + " | Kатегория:" + category + ". Рейтинг:" + ratingCalc()+"| Место в рейтинге: "+(ratingPosition+1));
        System.out.println("Книг в библиотеке: " + quantityOfBook);
    }

    public static void addBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги");
        book.setNameOfBook(scanner.nextLine());
        System.out.println("Введите автора книги:");
        book.setAutor(scanner.nextLine());
        System.out.println("Введите категорию книги:");
        book.setCategory(scanner.nextLine());
        System.out.println("Введите количесвто добавляемых книг:");
        book.setQuantityOfBook(scanner.nextInt());
        System.out.println("Книга успешно добавлена!");
    }
    public static void topOfBooks(Book[] books){
        for(int i = 0;i<books.length;i++){
            for(int j = 0;j<books.length;j++){
                if (books[i].ratingCalc()<books[j].ratingCalc()){
                    books[i].ratingPosition++;
                }
            }
        }

}
    public int ratingCalc() {
        if (ratings.isEmpty()) {
            return 0;
        }
        int ratingTemp = 0;
        for (Integer rating : ratings) {
            ratingTemp += rating;
        }
        rating=ratingTemp / ratings.size();
        return ratingTemp / ratings.size();
    }
}