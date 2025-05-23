package studentmng;

import java.util.Scanner;

public class student {
    private String Firstname;
    private String Lastname;
    private String courses = "";
    private String  StudentID;
    private int tuitionblace;
    private int gradeofyear;
    private static int ID = 1000;
    private static int Castofcouse = 600;
    
public student(){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter you First name :");
    this.Firstname = in.nextLine();

    System.out.print("Enter your Last name :");
    this.Lastname = in.nextLine();

    /*
    System.out.print("Enter your student ID :");
    this.studentID =in.nextInt();
    */

    
    System.out.print("1- Freshman\n2- Sophomore\n3- Junior\n4- Senior\n Enter the your Level :");
    this.gradeofyear = in.nextInt();
    setStudentID();

    // System.out.println(Firstname + " " + Lastname + " "  + StudentID/*+ studentID*/);




}
private void setStudentID(){
    ID ++;
    StudentID = gradeofyear + "" + ID;
}
public void enroll(){
    do{
    System.out.print("Enter course to Enroll ( Q to quit) :");
    Scanner in =new Scanner(System.in);

    String course = in.nextLine();
    if (!course.equals("Q")){
        courses = courses + "\n  " + course;
        tuitionblace = tuitionblace + Castofcouse;
    }else{
        
        break;
    }
} while (1!=0) ;
   // System.out.println("Enrilled in :" + courses);

}

public void viewBlance(){
    System.out.println("Your Balance is : $" + tuitionblace);
}
public void payTuition(){
    viewBlance();
    System.out.print("Enter your Payment :$");
    Scanner in =new Scanner (System.in);
    int amount = in.nextInt();
    tuitionblace = tuitionblace - amount;
    System.out.println(" Thank you for your payment : $" + amount);
    viewBlance();
}

public String toString(){
    return " Name : " + Firstname + " " + Lastname +
            "\n Grade Level : "+ gradeofyear +
            "\n Student ID : " + StudentID +
            "\n Course Enrolled : " + courses +
            "\n Your Balance :$" + tuitionblace;
}
    }

