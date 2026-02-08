public class Normal extends Member{
    public Normal(String name,int age){
        super(name, age);
    }
    public void showBenefits(){
        System.out.println("Hi "+super.getname()+" You have acces to the gym in the floor 1 and we are happy see your transformation");
    }
    public void calcFees(){
        System.out.println("the gym fees for you is 1000 per month and you have an access for floor  1");
    }
    
}
