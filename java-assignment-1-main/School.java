class Students{
    String name;
    int roll_no, grade;

    public void setStudent(String n, int r, int c){
        name = n;
        roll_no = r;
        grade = c;
    }

    public void getStudent(){
        System.out.println("Student Name = " + name);
        System.out.println("Roll No = " + roll_no);
        System.out.println("Class = " + grade);
    }
}

class Teachers{
    String name;
    double salary;
    int contact_no;
    public void setTeacher(String n, int s, int c){
        name = n;
        salary = s;
        contact_no = c;
    }

    public void getTeacher(){
        System.out.println("Teacher Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Contact Number = " + contact_no);
    }
}

public class School{    
    public static void main(String[] args) 
    {
        Students students = new Students();
        students.setStudent("Safal Bhandari", 10, 14);
        students.getStudent();

        Teachers teachers = new Teachers();
        teachers.setTeacher("Teacher Sir", 10000, 984123456);
        teachers.getTeacher();
    }    
}  