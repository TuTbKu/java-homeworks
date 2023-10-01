package oop.library;

public class TestLibBookStudent {
    public static void main(String[] args) {
        Penalty penalty = new Penalty();
        Library library = new Library();

        Book book1 = new Book();
        book1.nameOfBook = "Преступление и наказание";
        book1.autor = "Достоевский";
        book1.id = 1;
        book1.quantityOfBook = 3;
        book1.numberOfRatings = 3;
        book1.totalRatings = 5;
        book1.category = "Классика";

        Book book2 = new Book();
        book2.nameOfBook = "Граф Монте Кристо";
        book2.autor = "Дюма";
        book2.id = 2;
        book2.quantityOfBook = 4;

        Book book3 = new Book();
        book3.nameOfBook = "Сказка о рыбаке и рыбке";
        book3.autor = "Пушкин";
        book3.id = 3;
        book3.quantityOfBook = 7;

        Person student1 = new Person();
        student1.name = "Иван";
        student1.personId = 1;
        student1.role = "STUDENT";
        student1.penalty = penalty;
        student1.penalty.curentDay = 10;

        Person student2 = new Person();
        student2.name = "Петр";
        student2.personId = 2;
        student2.role = "STUDENT";
        student2.penalty = penalty;

        Person student3 = new Person();
        student3.name = "Саша";
        student3.personId = 3;
        student3.role = "STUDENT";
        student3.penalty = penalty;
        student3.penalty.curentDay = 10;

        Subject mathSubject = new Subject();
        mathSubject.name = "Математика";
        mathSubject.difficulty = "medium";
        mathSubject.startLevel = 1;

        Subject chemistrySubject = new Subject();
        chemistrySubject.name = "Химия";
        chemistrySubject.difficulty = "Hard";
        chemistrySubject.startLevel = 8;


        Person teacher1 = new Person();
        teacher1.name = "Лариса Ивановна";
        teacher1.role = "TEACHER";
        teacher1.personId = 1;
        teacher1.subject = chemistrySubject;

        Person teacher2 = new Person();
        teacher2.name = "Марина Петровна";
        teacher2.role = "TEACHER";
        teacher2.personId = 2;
        teacher2.subject = mathSubject;


        library.lendBook(teacher1, book1);
        System.out.println(" ");
        teacher1.display(teacher1);
        library.acceptBook(teacher1, book1);
        System.out.println(" ");
        library.acceptBook(teacher1, book1);
        teacher1.history();
    }
}