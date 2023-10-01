package oop.library;


public class Person {
    String name;
    String role;
    Subject subject;
    int personId;
    Book borrowedBook;
    Penalty penalty;
    boolean studentTakeBook = false;
    int teacherTakedBooKs = 0;
    String historyOfTakedBook = "";


    void display(Person person) {
        if (person.role.equals("STUDENT")) {
            System.out.println("Имя: " + name + ". Номер зачетной книжки:" + personId);
            if (borrowedBook != null) {
                System.out.println("Взятая книга: ");
                borrowedBook.display();
            } else {
                System.out.println("Нет взятых книг");
            }
        }
        if (person.role.equals("TEACHER")) {
            System.out.println("Имя: " + name + ". Предмет: " + subject.name + ". ");
            if (borrowedBook != null) {
                System.out.println("Взятая книга: ");
                borrowedBook.display();
            } else {
                System.out.println("Нет взятых книг");
            }
        }
    }
    void history() {
        System.out.println("История взятых книг: " + historyOfTakedBook);
    }
}