package RequiredClasses;

public class UserLogins {
    private String Username;
    private String Password;
    //Constructor-------------------------------------------------------------------------------------------------------
    public UserLogins(String username, String passward) {
        this.Username = username;
        this.Password = passward;
    }
    //==================================================================================================================
    public String getUsername() { return Username; }
    public String getPassward() { return Password; }
}
