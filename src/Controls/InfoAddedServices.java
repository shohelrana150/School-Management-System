package Controls;
import StudentInfo.StudentInfoForm;
import StudentInfo.StudentInfoForm;
import java.util.ArrayList;


public class InfoAddedServices {
    // create | post
    public static void create(StudentInfoForm st, ArrayList<StudentInfoForm> db) {

        for (StudentInfoForm student : db) {
            if (student.id == st.id) {
                System.out.println("Id already exist");
                return;
            }
        }
        db.add(st);
        System.out.println("Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<StudentInfoForm> db)
    {
        for (StudentInfoForm st: db)
        {
            if (st.id == id)
            {
                System.out.println("Student Information:");
                System.out.println("Id              : " + st.id);
                System.out.println("Name            : " + st.studentName);
                System.out.println("Age             : " + st.age);
                System.out.println("Department      : " + st.department);
                System.out.println("Admission Year  : " + st.admissionYear);
                System.out.println("Address         : " + st.getStudentAddress());
                return;
            }
        }
        System.out.println("Student Information Not Found in Database.");
    }

    // update
    public static void update(StudentInfoForm st, ArrayList<StudentInfoForm> db)
    {
        int update_index = 0;
        for (StudentInfoForm student: db)
        {
            if (student.id == st.id)
            {
                db.remove(update_index);
                db.add(st);
                return;
            }
            update_index ++;
        }
        System.out.println("Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<StudentInfoForm> db)
    {
        int item_index = 0;
        for (StudentInfoForm st: db)
        {
            if (st.id == id) {
                db.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("Item Not Found in Database");
    }
}
