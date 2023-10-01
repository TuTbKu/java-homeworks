package oop.library;

public class Book {
    String autor;
    String nameOfBook;
    int id;
    String category;
    int totalRatings;
    int numberOfRatings;
    int quantityOfBook;

    public void display() {
        System.out.println("Автор книги: ' " + autor + "' | Идентификатор Книги:" + id + "| " +
                "Название книги: " + nameOfBook + " | Kатегория:" + category + ". Рейтинг:" + totalRatings + "| Место в рейтинге:" + numberOfRatings);
        System.out.println("Книг осталось: " + quantityOfBook);

    }
}