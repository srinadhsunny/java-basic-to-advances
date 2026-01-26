public class fibonacci{
    public static void main(String[] args) {
        int i=2;
        int a=0;
        int b=1;
        int sum=0;
        System.out.println( a +"\n"+ b);
        while (i<=10) {
            System.out.println(a+b);
            sum=a+b;
            a=b;
            b=sum;
            i++;

        }
    }
}

