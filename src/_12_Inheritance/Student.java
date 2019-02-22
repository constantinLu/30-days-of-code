package _12_Inheritance;

public class Student extends Person {

    String firstName;

    String lastName;

    int id;

    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        int total = 0;

        for (int score : testScores) {
            total += score;
        }
        int avg = total / testScores.length;

        boolean grade;

        if (avg >= 90 && avg <= 100) {
            return 'O';
        }
        if (avg >= 80 && avg <= 90) {
            return 'E';
        }
        if (avg >= 70 && avg <= 80) {
            return 'A';
        }
        if (avg >= 55 && avg <= 70) {
            return 'P';
        }
        if  (avg >= 40 && avg <= 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
