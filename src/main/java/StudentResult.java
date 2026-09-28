public class StudentResult {

    public double calculateAverage(int marks1, int marks2, int marks3) {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassed(int marks1, int marks2, int marks3) {
        return marks1 >= 40 && marks2 >= 40 && marks3 >= 40;
    }
}
