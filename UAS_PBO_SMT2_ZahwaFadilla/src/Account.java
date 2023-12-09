public class Account {
    private String username;
    private String password;
    private double Balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        Balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}