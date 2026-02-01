public class main{
    public static void main(String[] args) {

        Building red = new Building("red");
        System.out.println(red.getcolor());
        Building anotherb=red;//here new object is not createed but new ref variavle another b is created which is again a referces for the red building obj
        System.out.println(anotherb.getcolor());
        
        //now lets use one ref another b and change color 
        anotherb.setcolor("yellow");//this wil change the color for th eobj thaat even red is ref variable sinces there is only one oj-bj created with referrnces variable change from one causes change in both 
        System.out.println("color changed using anotherb refernces ");
        System.out.println("color of red building is "+ red.getcolor());
        System.out.println("color of the another building is "+ anotherb.getcolor());
        Building green = new Building("green");//new object or building is created with color green 
        anotherb=green;
        //anotherb is now changed tothe green building now so the color is green and red buiding is now having only one ref "red" 
        System.out.println("color of green building is " + green.getcolor());

        System.out.println("color of another building is "+ anotherb.getcolor());
        
        System.out.println("color of red building is "+ red.getcolor());


    }
}
