package oop.library;

import java.util.Scanner;

public class Person {
    private String name;
    private String role;
    private Subject subject;
    private int personId;
    private Book borrowedBook;
    Penalty penalty;
    private boolean studentTakeBook = false;
    private int teacherTakedBooKs = 0;
    private String historyOfTakedBook = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public boolean isStudentTakeBook() {
        return studentTakeBook;
    }

    public void setStudentTakeBook(boolean studentTakeBook) {
        this.studentTakeBook = studentTakeBook;
    }

    public int getTeacherTakedBooKs() {
        return teacherTakedBooKs;
    }

    public void setTeacherTakedBooKs(int teacherTakedBooKs) {
        this.teacherTakedBooKs = teacherTakedBooKs;
    }

    public String getHistoryOfTakedBook() {
        return historyOfTakedBook;
    }

    public void setHistoryOfTakedBook(String historyOfTakedBook) {
        this.historyOfTakedBook = historyOfTakedBook;
    }

    void display() {
        System.out.println("Имя: " + name + ". Номер :" + personId + "   " + role);
        if (borrowedBook != null) {
            System.out.println("Взятая книга: ");
            borrowedBook.display();
        } else {
            System.out.println("Нет взятых книг");
        }
    }

    void history() {
        System.out.println("История взятых книг: " + historyOfTakedBook);
    }

    public static void addPerson(Person person) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите имя нового пользователя");
        person.setName(scanner.nextLine());
        System.out.println("Задайте роль нового пользователя.  Если студент введите 1. Если преподаватель введите 2:");
        if (scanner.nextInt() == 1) {
            person.setRole("STUDENT");
        } else {
            person.setRole("TEACHER");
            System.out.println("Введите предмет преподавателя:");
            if (scanner1.nextLine().equals("химия")) {
                person.setSubject(Subject.getChemistrySubject());
            } else if (scanner1.nextLine().equals("математика")) {
                person.setSubject(Subject.getMathSubject());
            }
        }
        System.out.println("Пользователь успешно добавлен!");
    }
}