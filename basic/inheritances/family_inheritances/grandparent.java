public class grandparent{
    private String color;
    private String height;
    public grandparent(String color, String height) {
        this.color = color;
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void behaviour(){
        System.out.println("am a grandparent i have my own behaviour");
    }
}
