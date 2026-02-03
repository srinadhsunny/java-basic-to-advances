public class parent extends grandparent{

    public parent(String color, String height, String eyecolor, String dna) {
        super(color, height);
        this.eyecolor = eyecolor;
        this.dna = dna;
    }
    private String eyecolor;
    public String getEyecolor() {
        return eyecolor;
    }
    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }
    public String getDna() {
        return dna;
    }
    public void setDna(String dna) {
        this.dna = dna;
    }
    private String dna;
    public void behaviour(){
        super.behaviour();
        System.out.println("its a  parent behaviour");
    }
}
