public class areamethodoverload {
    public static void main(String[] args){
        int side =5;
        int lengthrec=2;
        int breadthrec=4;
        int base=4;
        int height=5;
        printarea(side);
        printarea(lengthrec,breadthrec);
        printarea(base,height,0.5);
        

    }
    public static void printarea(int side){
        System.out.println("area of the square is "+ side*side);

    }
    public static void printarea(int lengthrec,int breadthrec){
        System.out.println("area of the rectangle  is "+ lengthrec*breadthrec);

    }
    public static void printarea(int base,int height,double half){
        System.out.println("area of the traingle  is "+ base*height);

    }


    
}
