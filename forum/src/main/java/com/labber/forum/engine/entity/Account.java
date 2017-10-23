package com.labber.forum.engine.entity;

/**
 * @author Tony
 * @create 2017 - 10 -23 -22:49
 */
public class Account extends BaseEntity{

    private String accountId;
    private String accountName;
    private String accountEmail;
    private String accountPhone;
    private String accountSsoId;
    private AccountInfo accountInfo;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    public String getAccountSsoId() {
        return accountSsoId;
    }

    public void setAccountSsoId(String accountSsoId) {
        this.accountSsoId = accountSsoId;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}
