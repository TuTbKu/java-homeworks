package oop.library;

class Library {
    void lendBook(Person person, Book book) {
        if (person.role.equals("STUDENT")) {
            if (!person.studentTakeBook && book.quantityOfBook > 0) {
                person.borrowedBook = book;
                book.quantityOfBook--;
                person.studentTakeBook = true;
                person.historyOfTakedBook = person.historyOfTakedBook + book.nameOfBook + "| ";
                System.out.println("Студент" + person.name + " взял книгу: " + book.nameOfBook);
            } else {
                System.out.println("Студент не вернул книгу взятую ранее");
            }
        }

        if (person.role.equals("TEACHER")) {
            if (book.quantityOfBook > 0) {
                person.borrowedBook = book;
                book.quantityOfBook--;
                person.historyOfTakedBook = person.historyOfTakedBook + book.nameOfBook + "| ";
                System.out.println("Преподаватель " + person.name + " взял книгу: " + book.nameOfBook);
                person.teacherTakedBooKs++;
            } else {
                System.out.println("Данная книга закончилась в библиотеке");
            }
        }
    }

    void acceptBook(Person person, Book book) {
        if (person.role.equals("STUDENT")) {
            if (person.studentTakeBook) {
                person.studentTakeBook = false;
                book.quantityOfBook++;
                person.borrowedBook = null;
                System.out.println("Студент " + person.name + " вернул книгу:" + book.nameOfBook);
                if (person.penalty.curentDay > person.penalty.maxDays) {
                    person.penalty.penaltyDays = person.penalty.curentDay - person.penalty.maxDays; // Вычисление просрочки
                    System.out.println("Книга возвращена с просрочкой. Штраф: " + (person.penalty.penaltyDays * person.penalty.penaltyPrise));// Вывод вычисление суммы штрафа
                }
            } else {
                System.out.println("У студента нет взятых книг");
            }
        }
        if (person.role.equals("TEACHER")) {
            if (person.teacherTakedBooKs != 0) {
                System.out.println("Преподаватель " + person.name + " вернул книгу: " + book.nameOfBook);
                book.quantityOfBook++;
                person.teacherTakedBooKs--;
                person.borrowedBook = null;
            } else {
                System.out.println("У преподавателя нет книг для возврата");
            }
        }
    }
}