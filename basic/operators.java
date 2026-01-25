public class operators {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=a+b;
        System.out.println("summation of a and b is "+ c);//arthematic operatoers are +,-,*,/,%
        a++;
        b--;
        
        System.out.println("incremented value of a and b is "+ a +"and"+ b);//unary operators which require only one variable to perform an operation
        
        System.out.println(a==b)//Relational operators compares 2 inputs and returns a boolean value either true or false 
           // (== (Equal to),!= (Not equal to),> (Greater than),< (Less than),>= (Greater than or equal to),<= (Less than or equal to))
        System.out.println(a&&b)//logical operators performs logical operations like logical and and logical or 
            //Logical and(&&)//Logical or(||)//Logicall not(!)
        //assignment operators
            a+=1;()//+=, -=, *=, /= (Compound assignments: a += 5 is the same as a = a + 5)
        //ternary operator
            System.out.println((a > 0) ? "positive" : "negative");
        //Syntax: variable = (condition) ? value_if_true : value_if_false;
        //bitwise operators
        System.out.println(a&b)//& (Bitwise AND),| (Bitwise OR),^ (Bitwise XOR),<< (Left shift),>> (Right shift)
            
            
    }
}
