package studentmng;

import java.util.Scanner;

public class studentDatabase {
    public static void main(String[] args) {
        
        System.out.print("Enter the number of student to Enroll :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        student[] students = new student[num];

        for (int n = 0; n < num; n++) {
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }


        
    }
}
