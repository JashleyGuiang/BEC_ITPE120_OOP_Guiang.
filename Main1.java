import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Grading: ");
        double fGrade = sc.nextDouble();

        System.out.print("Second Grading: ");
        double sGrade = sc.nextDouble();

        System.out.print("Third Grading: ");
        double tGrade = sc.nextDouble();

        System.out.print("Fourth Grading: ");
        double frGrade = sc.nextDouble();

        double finalGrade = Math.average(fGrade,sGrade,tGrade,frGrade);
        System.out.println("Final Grade: " + finalGrade);
    }
}
