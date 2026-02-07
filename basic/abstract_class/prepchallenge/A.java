// It is inherited by two other classes 'A' and 'B' each having a method with the same name 
// // which returns the percentage of the students. The constructor of student A 
// // takes the marks in three subjects as its parameters
public class A extends Marks{
    private int s1;
    private int s2;
    private int s3;
    public A(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public void getPercentage(){
        double percentage=(s1+s2+s3)/300.0 *100;
        System.out.println("the percentage of Student  A is " + percentage);
    }

}
