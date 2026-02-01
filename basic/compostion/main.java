public class main {
    public static void main(String[] args) {
        Student s1 = new Student("sunnny", "123");
        Section finalyear = new Section(s1);
        Branch ECE = new Branch(s1, new Section(new Student("manish","432545")));
        floor f1 = new floor("12");
        library apj = new library("Sciences",f1);
        college ace = new college(apj, ECE);
        university jntuh= new university(ace);
        jntuh.getCollege().getBranch().getSection().getStudent().study();

        
    }
    
}
