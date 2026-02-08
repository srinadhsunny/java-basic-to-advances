public class main{
    public static void main(String[] args) {
        Normal m1 = new Normal("Sunny", 20);
        m1.calcFees();
        m1.showBenefits();
        GoldMember g1 = new GoldMember("Srinadh", 21);
        g1.calcFees();
        g1.showBenefits();
        GoldMember.workOut w1 = g1.new workOut();
        w1.showPlan();
    }
}
