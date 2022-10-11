package com.SEPTChallenge2.Account.model;
import java.util.ArrayList;
import java.util.List;

public class Accounts {
    private List<Account> accList;

    public List<Account> getaccList() {
        if(accList == null) {
            accList = new ArrayList<>();
        }
        return accList;

    }

    public void setperList(List<Account> accList) {
        this.accList = accList;
    }
}

