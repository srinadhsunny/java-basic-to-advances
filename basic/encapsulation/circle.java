public class circle{
    private double radius;
    public circle(double radius) {
        this.radius = radius;
    }
    public void setradius(double r){
        this.radius=r;
    }
    public double getradius(){
        return this.radius;
    }
    public  double calcarea(double r){
        double area = 3.14*r*r;
        return area;

    }
}
