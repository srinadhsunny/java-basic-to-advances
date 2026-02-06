public class main {
    public static void main(String[] args) {
        outer ot = new outer();
        outer.inner it = ot.new inner();
        it.display();
    }
}
// ___________________
//   outer.java
  public class outer{
    private int a =1;
     public class inner{
       private int b=2;
        public void display(){
            System.out.println(  "the value of a is "+a +"and the value of b is "+ b);
        }
    }
    
}
