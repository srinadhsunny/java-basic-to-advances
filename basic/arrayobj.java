import java.util.Scanner;
public class arrayobj {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the length oof an array ");
       int n=sc.nextInt();
        int[] userarray=getuserArray(n,sc);
        System.out.print("user array is ");
        for(int i =0;i<n;i++){
              System.out.print( userarray[i]+" ");
        }
        System.out.println();

        int sum=getsumelements(userarray);
        System.out.println("sum of elements is "+ sum);

        double average=getaverage(userarray);
        System.out.println("average of array is "+ average);

        int[] sortedarray= getsortedarray(userarray);
        System.out.print("sorted  arra is");
        for(int i=0;i<sortedarray.length;i++){
            System.out.print(sortedarray[i]);
        }

    }
    //method to get user values 
    public static int[] getuserArray(int n,Scanner sc){
        System.out.println(" enter array values");

        int[] uservalues = new int[n];
        for(int i=0;i<n;i++){
            uservalues[i]=sc.nextInt();
        }
        return uservalues;

    }
    //method to find sum of the elements 
    public static int getsumelements(int[] array){
        int s=0;
        for(int i =0;i<array.length;i++){
            s+=array[i];
        }
        return s;
    }
    //methosd to find the average 
    public static double getaverage(int[] array){
        double avg=(double)getsumelements(array)/array.length;
        return avg;
    }
    public static int[] getsortedarray(int[] orgarray){
        int[] array = orgarray.clone();
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }

            }
        }
        return array;
    }
}
