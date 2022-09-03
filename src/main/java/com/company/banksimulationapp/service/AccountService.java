package com.company.banksimulationapp.service;

import com.company.banksimulationapp.enums.AccountType;
import com.company.banksimulationapp.model.Account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    Account createNewAccount(BigDecimal balance, Date creationDate, AccountType accountType, Long userId);

    List<Account>listAllAccount();

}
