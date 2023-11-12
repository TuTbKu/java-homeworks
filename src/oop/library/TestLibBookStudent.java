package oop.library;

import java.util.ArrayList;
import java.util.Scanner;

public class TestLibBookStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penalty penalty = new Penalty();
        Library library = new Library();

        Book[] books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            books[i].setRatings(new ArrayList<>());
            books[i].setId(i + 1);
        }

        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].setPersonId(i + 1);
            persons[i].penalty = penalty;
        }

        Subject mathSubject = new Subject();
        mathSubject.name = "Математика";
        mathSubject.difficulty = "medium";
        mathSubject.startLevel = 8;

        books[0].setNameOfBook("Преступление и наказание");
        books[0].setAutor("Достоевский");
        books[0].setQuantityOfBook(3);
        books[0].setCategory("Классика");

        books[1].setNameOfBook("Граф Монте Кристо");
        books[1].setAutor("Дюма");
        books[1].setQuantityOfBook(4);
        books[1].setCategory("Классика");

        books[2].setNameOfBook("Сказка о рыбаке и рыбке");
        books[2].setAutor("Пушкин");
        books[2].setQuantityOfBook(7);
        books[2].setCategory("Классика");


        persons[0].setName("Иван");
        persons[0].setRole("STUDENT");
        persons[0].penalty = penalty;
        persons[0].penalty.curentDay = 10;

        persons[1].setName("Петр");
        persons[1].setRole("STUDENT");
        persons[1].penalty = penalty;

        persons[2].setName("Саша");
        persons[2].setRole("STUDENT");
        persons[2].penalty = penalty;
        persons[2].penalty.curentDay = 10;

        persons[3].setName("Лариса Ивановна");
        persons[3].setRole("TEACHER");
        persons[3].setSubject(mathSubject);

        persons[4].setName("Марина Петровна");
        persons[4].setRole("TEACHER");
        persons[4].setSubject(mathSubject);

        System.out.println("Добро пожаловать в систему управления библиотекой");


        while (true) {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Посмотерть список доступных книг");
            System.out.println("2 - Добавить книгу в библиотеку");
            System.out.println("3 - Посмотреть список пользователей библиотеки");
            System.out.println("4 - Добавить пользователя в библиотеку");
            System.out.println("5 - Выдать книгу");
            System.out.println("6 - Принять книгу");
            System.out.println("0 - Завершить работу с системой");

            int command = scanner.nextInt();

            if (command == 1) {
                for (Book book : books) {
                    if (book.getNameOfBook() != null) {
                        Book.topOfBooks(books);
                        book.display();
                    }
                }
            } else if (command == 2) {
                for (Book book : books) {
                    if (book.getNameOfBook() == null) {
                        Book.addBook(book);
                        break;
                    }
                }
            } else if (command == 3) {
                for (Person person : persons) {
                    if (person.getName() != null) {
                        person.display();
                        person.history();
                    }
                }
            } else if (command == 4) {
                for (Person person : persons) {
                    if (person.getName() == null) {
                        Person.addPersor(person);
                        break;
                    }
                }
            } else if (command == 5) {
                System.out.println("Выдача книги");
                System.out.println("Введите айди книги");
                int numberOfBook = scanner.nextInt();
                System.out.println("Введите айди пользователя");
                int userId = scanner.nextInt();
                library.lendBook(persons[userId - 1], books[numberOfBook - 1]);
            } else if (command == 6) {
                System.out.println("Возврат книги");
                System.out.println("Введите айди книги");
                int numberOfBook = scanner.nextInt();
                System.out.println("Введите айди пользователя");
                int userId = scanner.nextInt();
                System.out.println("Какую оценку пользователь поставил книге?");
                int rating = scanner.nextInt();
                books[numberOfBook-1].getRatings().add(rating);
                System.out.println("Сколько дней была книга у пользователя?");
                persons[userId - 1].penalty.curentDay = scanner.nextInt();
                library.acceptBook(persons[userId - 1], books[numberOfBook - 1]);
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}