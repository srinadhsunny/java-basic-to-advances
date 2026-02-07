public class B extends Marks{
    private int s1;
    private int s2,s3,s4;
    public B (int s1, int s2,int s3,int s4){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
    public void getPercentage(){
        double percentage=(s1+s2+s3+s4)/400.0*100;
        System.out.println("the percentage of Student B is "+ percentage);
    }
}
