public abstract  class Member{
    private String name;
    private int age;
    public Member(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
    public abstract void showBenefits();
    public abstract void calcFees();

}
