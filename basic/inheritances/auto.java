public class auto{
    private String color;
    private String power;
    public auto(String color, String power, int milage, int yearOfManufactor) {
        this.color = color;
        this.power = power;
        this.milage = milage;
        this.yearOfManufactor = yearOfManufactor;
    }
    private int milage;
    private int yearOfManufactor;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public int getMilage() {
        return milage;
    }
    public void setMilage(int milage) {
        this.milage = milage;
    }
    public int getYearOfManufactor() {
        return yearOfManufactor;
    }
    public void setYearOfManufactor(int yearOfManufactor) {
        this.yearOfManufactor = yearOfManufactor;
    }
    public void movement(){
        System.out.println("auto mobile is moving");
    }
}
