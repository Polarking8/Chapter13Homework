package MapGrades;

public class GradeBookTester {
    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        if(!book.updateGrade("Bobby", "B-")){
            System.out.println("Bobby is not yet in the grade book, add him first");
        }
        if(!book.addGrade("Bobby", "B-")){
            System.out.println("Bobby is in the grade book, update his grade.");
        }
        if(!book.removeGrade("Bobby")){
            System.out.println("Bobby was not in the grade book");
        }
        book.addGrade("Joe", "A-");
        book.addGrade("Fred", "B-");
        book.addGrade("Billy", "B+");

        for(var entry: book.getGrades().entrySet()){
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
