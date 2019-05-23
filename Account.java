public class Account {
    private String username;
    private String password;
    private int ID;
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String theUsername){
        username = theUsername;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String thePassword){
        password = thePassword;
    }
    
    public int getID(){
        return ID;
    }
    public void setID(int theID){
        ID = theID;
    }
    
    public void display(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("ID: " + ID);
    }
}