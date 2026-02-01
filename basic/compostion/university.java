public class university {
    private college college;
    private String yearOfJoining;
    public college getCollege() {
        return college;
    }
    public university(college college, String yearOfJoining) {
        this.college = college;
        this.yearOfJoining = yearOfJoining;
    }
    public university(college college) {
        this.college = college;
        this.yearOfJoining = "def";
    }
    public void setCollege(college college) {
        this.college = college;
    }
    public String getYearOfJoining() {
        return yearOfJoining;
    }
    public void setYearOfJoining(String yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
}
