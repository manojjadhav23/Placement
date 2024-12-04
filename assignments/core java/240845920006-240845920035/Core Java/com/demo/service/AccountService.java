package com.demo.service;

import com.demo.beans.Account;
import java.util.Set;
import java.util.List;
public interface AccountService {

	boolean addNewAcnt(int ch);

	Set<Account> findAll();

	boolean depositeamt(String acid, int pin, double amt);

	int withdrawamt(String acid, int pin, double amt);

}
