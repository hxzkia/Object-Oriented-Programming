package model;

public class User {
    
    private int id;
    private String fullname;
    private String username;
    private String password;
    private int privilege;

    public User(int id, String fullname, String username, String password, int privilege) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.privilege = privilege;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname.trim();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
