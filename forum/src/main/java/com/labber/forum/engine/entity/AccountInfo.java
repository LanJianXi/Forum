package com.labber.forum.engine.entity;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:01
 */
public class AccountInfo extends BaseEntity{

    private String accountId;
    private String accountBirthDay;
    private String accountAvatar;
    private String accountInfo;
    private String accountNote;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountBirthDay() {
        return accountBirthDay;
    }

    public void setAccountBirthDay(String accountBirthDay) {
        this.accountBirthDay = accountBirthDay;
    }

    public String getAccountAvatar() {
        return accountAvatar;
    }

    public void setAccountAvatar(String accountAvatar) {
        this.accountAvatar = accountAvatar;
    }

    public String getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }

    public String getAccountNote() {
        return accountNote;
    }

    public void setAccountNote(String accountNote) {
        this.accountNote = accountNote;
    }
}
