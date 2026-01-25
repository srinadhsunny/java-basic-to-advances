public class conditionLoops {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        //if-else condition
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is  greater than a");
        }
        //switch logic
        switch (a) {
            case 1:
                System.out.println("sunday ");
                
                break;
            case 2:
                System.out.println("monday");
        
            default:
                System.out.println("not found");
                break;
        }
        //enhanced switch logic
        switch (a) {
            case 1->System.out.println("momday");
            case 2->System.out.println("tuesday");
            default -> { }
        }
        //while condition
        while (a<3) {
            a++;
            System.out.println("a value increnented is "+a);
        }
        a=1;
        // do while 
        do{
            a++;
            System.out.println(" a value is "+ a);
        }while(a<5);

    

    }
}
