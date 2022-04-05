package StudentInfo;

public class StudentInfoForm {
    public int id;
    public  String studentName;
    public  String department;
    public int age;
    public  int admissionYear;
    public String contact;
    public String address;




    public StudentInfoForm(int id, String studentName, String department, int age, int admissionYear, String contact, String address){
        this.id = id;
        this.studentName = studentName;
        this.department = department;
        this.age = age;
        this.admissionYear = admissionYear;
        this.contact = contact;
        this.address = address;


    }

    public String setStudentContact(String contact) {
        if (String.valueOf(contact).length() == 6) {
            return contact;
        }
        else {
            return "Invalid Contact";
        }
    }

    public String getStudentAddress() {
        return this.address;
    }

    public void setStudentAddress(String address) {
        this.address = address;
    }
}
