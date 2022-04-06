

import java.util.Scanner;

public class Grades {

    public static void newGrades() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = scan.nextLine();
        System.out.println("Введите оценку");
        int grade = scan.nextInt();

        if(grade <= 5) {
            System.out.println("У " + name + " плохая оценка " + grade);
        }
        else {
            System.out.println("У " + name + " хорошая оценка: " + grade);
        }
    }



}
