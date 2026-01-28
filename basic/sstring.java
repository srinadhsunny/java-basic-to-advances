import java.util.Scanner;
public class sstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s= sc.nextLine();
        String res=reversestr(s);
        System.out.println(res);

        
    }
    public static String reversestr(String s){
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
