public class Student {
    String fName;
    String lName;
    int StudentID;
    String Status;

    public Student(String FirstName, String LastName, int StudentID, String Status) {
        this.fName = FirstName;
        this.lName = LastName;
        this.StudentID = StudentID;
        this.Status = Status;
    }

    public static void main(String[] args) {
        Student student = new Student("Lisa"," Palombo", 123456789 ,"Active");
        System.out.println("Nama    : " +student.fName + "" + student.lName + "\nID      : " + student.StudentID + "\nStatus  : " + student.Status);
    }
}