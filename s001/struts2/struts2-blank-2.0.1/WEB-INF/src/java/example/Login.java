package example;

public class Login extends ExampleSupport {

    public String execute() throws Exception {

        if (getUsername()!="admin") return INPUT;

        if (getPassword()!="admin") return INPUT;

        return SUCCESS;
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }

    private String username;

    public String getUsername() {
    	System.out.println("\n"+username+"\n");
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public String getPassword() {
    	System.out.println("\n"+password+"\n");
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}