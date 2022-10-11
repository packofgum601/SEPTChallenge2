package com.SEPTChallenge2.Account.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder

public class Account {
    public Long id;
    public String AccountType;
    public String AccountNumber;
    public String AccountName;
    public Long Balance;
    public Date date;

}
