public class main{
    public static void main(String[] args) {
        circle c = new circle(5.5);
    
    double area = c.calcarea(c.getradius());//using getter to acccess the radius bcz its a encapsulated and private 
    System.out.println(area);
    }
}
