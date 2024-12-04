package com.demo.dao;

import java.util.Set;

import com.demo.beans.Account;

public interface AccountDao {

	boolean saveaccount(Account ac);

	Set<Account> findAll();

	Account findbyid(String acid, int pin);

	Account seaechbyid(String acid, int pin);

}
