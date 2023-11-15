package oop.library;

class Library {
    void lendBook(Person person, Book book) {
        if (person.getRole().equals("STUDENT")) {
            if (!person.isStudentTakeBook() && book.getQuantityOfBook() > 0) {
                person.setBorrowedBook(book);
                book.setQuantityOfBook(book.getQuantityOfBook()-1);
                person.setStudentTakeBook(true);
                person.setHistoryOfTakedBook(person.getHistoryOfTakedBook()+book.getNameOfBook()+ "| ");
                System.out.println("Студент" + person.getName() + " взял книгу: " + book.getNameOfBook());
            } else {
                System.out.println("Студент не вернул книгу взятую ранее");
            }
        }

        if (person.getRole().equals("TEACHER")) {
            if (book.getQuantityOfBook() > 0) {
                person.setBorrowedBook(book);
                book.setQuantityOfBook(book.getQuantityOfBook()-1);
                person.setHistoryOfTakedBook(person.getHistoryOfTakedBook()+book.getNameOfBook()+ "| ");
                System.out.println("Преподаватель " + person.getName() + " взял книгу: " + book.getNameOfBook());
                person.setTeacherTakedBooKs(person.getTeacherTakedBooKs()+1);
            } else {
                System.out.println("Данная книга закончилась в библиотеке");
            }
        }
    }

    void acceptBook(Person person, Book book) {
        if (person.getRole().equals("STUDENT")) {
            if (person.isStudentTakeBook()) {
                person.setStudentTakeBook(false);
                book.setQuantityOfBook(book.getQuantityOfBook()+1);
                person.setBorrowedBook(null);
                System.out.println("Студент " + person.getName() + " вернул книгу:" + book.getNameOfBook());
                if (person.penalty.curentDay > person.penalty.maxDays) {
                    person.penalty.penaltyDays = person.penalty.curentDay - person.penalty.maxDays; // Вычисление просрочки
                    System.out.println("Книга возвращена с просрочкой. Штраф: " + (person.penalty.penaltyDays * person.penalty.penaltyPrise));// Вывод вычисление суммы штрафа
                }
            } else {
                System.out.println("У студента нет взятых книг");
            }
        }
        if (person.getRole().equals("TEACHER")) {
            if (person.getTeacherTakedBooKs()!= 0) {
                System.out.println("Преподаватель " + person.getName() + " вернул книгу: " + book.getNameOfBook());
                book.setQuantityOfBook(book.getQuantityOfBook()+1);
                person.setTeacherTakedBooKs(person.getTeacherTakedBooKs()-1);
                person.setBorrowedBook(null);;
            } else {
                System.out.println("У преподавателя нет книг для возврата");
            }
        }
    }
    boolean bookPersonCorrect(Book book, Person person){
       return  (book.getNameOfBook() == null&person.getName()==null);
    }
}