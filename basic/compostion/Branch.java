public class Branch {
    private Student Student;
    public Branch(Student student, Section section) {
        Student = student;
        Section = section;
    }
    private Section Section;
    public Student getStudent() {
        return Student;
    }
    public void setStudent(Student student) {
        Student = student;
    }
    public Section getSection() {
        return Section;
    }
    public void setSection(Section section) {
        Section = section;
    }

    
}
