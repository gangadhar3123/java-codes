
import java.util.Scanner;

class University_Details_main {
    String Name;
    int Age;
    char Gender;
    String st_name;

    University_Details_main(String name, int age, char gender, String st_name) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
        this.st_name = st_name;
    }

    void Display_Details() {
        System.out.println("The Name of the " + st_name + " is : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Gender : " + Gender);
    }
}

class Student extends University_Details_main {
    String Course;
    int Student_ID;
    int Sub_1;
    int Sub_2;
    int Sub_3;
    double total_marks;

    Student(String name, int age, char gender, String st_name, int student_id, String course, int sub1, int sub2, int sub3) {
        super(name, age, gender, st_name);
        this.Student_ID = student_id;
        this.Course = course;
        this.Sub_1 = sub1;
        this.Sub_2 = sub2;
        this.Sub_3 = sub3;
    }

    void Display_Student_Details() {
        Display_Details();
        System.out.println("Student Course : " + Course);
        System.out.println("Student ID : " + Student_ID);
        System.out.println("Student sub_1 Marks : " + Sub_1);
        System.out.println("Student sub_2 Marks : " + Sub_2);
        System.out.println("Student sub_3 Marks : " + Sub_3);
        total_marks = (Sub_1 + Sub_2 + Sub_3) / 3.0; // average
        System.out.println("Student Average Marks : " + total_marks);
    }
}

class Lecture_Details extends University_Details_main {
    String Department;
    int emp_id;
    int Salary;

    Lecture_Details(String name, int age, char gender, String st_name, String department, int emp_id, int salary) {
        super(name, age, gender, st_name);
        this.Department = department;
        this.emp_id = emp_id;
        this.Salary = salary;
    }

    void Display_Lecture_details() {
        Display_Details();
        System.out.println("Department : " + Department);
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Employee Salary : " + Salary);
    }
}

public class University_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. For Student Details.");
        System.out.println("2. For Employee Details.");
        System.out.print("Enter Your Option : ");
        int option = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Gender (M/F) : ");
        char gender = sc.next().charAt(0);
        sc.nextLine(); // clear buffer

        switch (option) {
            case 1: {
                System.out.print("Enter Student ID : ");
                int stu_id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Course Name : ");
                String course = sc.nextLine();
                System.out.print("Enter sub_1 Marks: ");
                int s1 = sc.nextInt();
                System.out.print("Enter sub_2 Marks: ");
                int s2 = sc.nextInt();
                System.out.print("Enter sub_3 Marks: ");
                int s3 = sc.nextInt();

                Student s = new Student(name, age, gender, "Student", stu_id, course, s1, s2, s3);
                s.Display_Student_Details();
                break;
            }

            case 2: {
                System.out.print("Enter Employee ID : ");
                int emp_id = sc.nextInt();
                System.out.print("Enter Employee Salary : ");
                int emp_salary = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Department Name : ");
                String emp_department = sc.nextLine();

                Lecture_Details l = new Lecture_Details(name, age, gender, "Lecture", emp_department, emp_id, emp_salary);
                l.Display_Lecture_details();
                break;
            }

            default:
                System.out.println("Invalid Option!");
        }

        sc.close();
    }
}

