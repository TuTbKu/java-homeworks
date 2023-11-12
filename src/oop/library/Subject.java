package oop.library;

public class Subject {
    String name;
    String difficulty;
    int startLevel;

    public static Subject getChemistrySubject() {
        Subject chemistrySubject = new Subject();
        chemistrySubject.name = "Химия";
        chemistrySubject.difficulty = "medium";
        chemistrySubject.startLevel = 8;
        return chemistrySubject;
    }
    public static Subject getMathSubject() {
        Subject mathSubject = new Subject();
        mathSubject.name = "Математика";
        mathSubject.difficulty = "medium";
        mathSubject.startLevel = 8;
        return mathSubject;
    }
}