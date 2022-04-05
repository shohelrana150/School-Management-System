package Controls;

import StudentInfo.StudentInfoForm;

import java.util.Scanner;

public class FilupForm {
    public static StudentInfoForm fillUp() {
        System.out.println("Fill Up the below form:");

        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.print("Name: ");
        String studentName = scan.nextLine();

        System.out.print("Department: ");
        String department = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Admission Year: ");
        int admissionYear = scan.nextInt();

        System.out.print("Contact: ");
        String contact = scan.next();

        System.out.print("Address: ");
        String address = scan.next();

        StudentInfoForm std = new StudentInfoForm(id, studentName, department, age, admissionYear, contact, address);
        std.setStudentContact(address);

        return std;
    }
}
