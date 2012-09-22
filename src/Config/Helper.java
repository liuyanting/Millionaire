package Config;

public class Helper {

    private boolean delete = true;
    private boolean teacher = true;
    private boolean classmate = true;
    
    public Helper() {
        initHelper();
    }
    
    private void initHelper() {
        delete = teacher = classmate = true;
    }
    
    public void useHelper(String name) {
        if(name.equals("delete")) delete = false;
        else if(name.equals("teacher")) teacher = false;
        else if(name.equals("classmate")) classmate = false;
        else System.err.println("Unsupported helper option.");
    }
    
    public boolean getHelper(String name) {
        if(name.equals("delete")) return delete;
        else if(name.equals("teacher")) return teacher;
        else if(name.equals("classmate")) return classmate;
        else {
            System.err.println("Unsupported helper option.");
            return false;
        }
    }
}
