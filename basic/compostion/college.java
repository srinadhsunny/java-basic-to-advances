public class college {
    private library library;
    private Branch branch;
    
    
    
    public college(library library, Branch branch) {
        this.library = library;
        this.branch = branch;
    }
    public library getLibrary() {
        return library;
    }
    public void setLibrary(library library) {
        this.library = library;
    }
    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    

    
}
