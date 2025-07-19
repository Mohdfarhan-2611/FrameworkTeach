package org.example.POJO;

public class User {

    private String validEmailAddress;
    private String validPassword;

    public User(String validEmailAddress, String validPassword) {
         this.validEmailAddress = validEmailAddress;
         this.validPassword = validPassword;
    }

    public String getValidEmailAddress() {
        return validEmailAddress;
    }

    public void setValidEmailAddress(String validEmailAddress) {
        this.validEmailAddress = validEmailAddress;
    }

    public String getValidPassword() {
        return validPassword;
    }

    public void setValidPassword(String validPassword) {
        this.validPassword = validPassword;
    }
}
