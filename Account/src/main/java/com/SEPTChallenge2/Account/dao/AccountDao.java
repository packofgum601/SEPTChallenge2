package com.SEPTChallenge2.Account.dao;
import com.SEPTChallenge2.Account.model.Accounts;
import com.SEPTChallenge2.Account.model.Account;
import org.springframework.stereotype.Repository;

public class AccountDao {
    public static Accounts list = new Accounts();
    static{
        list.getaccList().add(new Account(1,"Joe","16 Main St", "3030", "57","Engineer","J@mail.com","123456789"));
    }

    public Accounts getAllAccounts(){
        return list;
    }

}
