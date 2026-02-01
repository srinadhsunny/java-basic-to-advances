public class Student {
    private String studentname;
    private String studentrollno;
    public Student(String studentname, String studentrollno) {
        this.studentname = studentname;
        this.studentrollno = studentrollno;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getStudentrollno() {
        return studentrollno;
    }
    public void setStudentrollno(String studentrollno) {
        this.studentrollno = studentrollno;
    }
    public void study(){
        System.out.println("students are studying");
    }
    
}
