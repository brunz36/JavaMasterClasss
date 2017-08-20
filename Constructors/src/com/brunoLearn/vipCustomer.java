package com.brunoLearn;

public class vipCustomer {

    private String vipName;
    private int creditLimit;
    private String vipEmail;

    public vipCustomer() {
        this("VIP", 999999, "vip@email.com");
    }

    public vipCustomer(String vipName, int creditLimit) {
        this(vipName, creditLimit, "duke@email.com");
    }

    public vipCustomer(String vipName, int creditLimit, String vipEmail) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
    }

    public String getVipName() {
        return vipName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }
}
