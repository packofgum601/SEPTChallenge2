package com.SEPTChallenge2.Account.repository;
import com.SEPTChallenge2.Account.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Long>{}