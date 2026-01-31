public class student {
    private String Studentname;
    private int  rollno;
    private int standard;
    private String sec;

    public student(){
        this.Studentname="defname";
        this.rollno=00;
        this.standard=0;
        this.sec="def";
        System.out.println("default constructor created");
    }
    public student(String name,int rollno){
        this.Studentname=name;
        this.rollno=rollno;
        this.standard=0;
        this.sec="def";
        System.out.println("constructor for 2   parameters created");

    }
    public student(String name,int rollno,int standard,String sec){
        this.Studentname=name;
        this.rollno=rollno;
        this.standard=standard;
        this.sec=sec;
        System.out.println(" constructor created for 4 parameters");

    }
    public String getname(){
        return this.Studentname;
    }
    public int getrollno(){
        return this.rollno;
    }
    public int getstandard(){
        return this.standard;
    }
    public String getsec(){
        return this.sec;
    }
}
