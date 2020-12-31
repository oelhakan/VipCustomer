public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer() {
        this("defaultName", "defaultEmailAddress", 0);
    }

    public VipCustomer(String emailAddress, double creditLimit) {
        this("defaultName", emailAddress, creditLimit);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
