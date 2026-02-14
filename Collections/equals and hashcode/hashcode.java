public class Hashcode{
    public static void main(String[] args) {
        Student s1 = new Student("sunny", 1);
        Student s2 = new Student("srinadh", 2);
        Student s3 = s1;//shares same memory adrres as s1 and s3 and s1 object point same memory interface
        System.out.println(s1==s3);
        System.out.println("s1: "+s1.hashCode()+" s2:"+s2.hashCode()+" s3: "+s3.hashCode());
        //we cane se that the cash code  for s1 and s3 are same which is the integer reepresentation of adress 
    }
}
