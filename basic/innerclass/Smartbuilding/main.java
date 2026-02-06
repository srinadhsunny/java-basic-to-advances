// The Main Class:
// Instantiate the SmartBuilding.
// Instantiate the SecuritySystem (remember that ot.new inner() syntax!).
// Call checkStatus().
public class main {
    public static void main(String[] args) {
        SmartBuilding sb = new SmartBuilding("our home", true);
        SmartBuilding.SecuritySystem ss = sb.new SecuritySystem();
        ss.checkStatus();
        SmartBuilding sv = new SmartBuilding("happy home", false);
        SmartBuilding.SecuritySystem sss = sv.new SecuritySystem();
        sss.checkStatus();
    }
}
//------
