public class GoldMember extends Member{
    public GoldMember(String name,int age){
        super(name, age);
    }
    public void showBenefits(){
        System.out.println("Hi "+super.getname()+"happy to see you as a gold member and you have an accesss to swimming pool in floor 2 and dancing  club at floor 3");
    }
    public void calcFees(){
        System.out.println("the fees for you as gold member is  3000/month");
    }
    public class workOut {
        public void showPlan(){
            System.out.println("your custimized workout plan is loading");
        }
    }
}
