package com.nsu.tly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsu.tly.entity.Account;
import com.nsu.tly.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
    private AccountMapper accountMapper;
    
	@Override
	public boolean loginCheck(String username, String password) {
		
		Account account=accountMapper.selectByUserName(username);
		if(account!=null) {
			if(account.getPassword().equalsIgnoreCase(password)) {
				return true;//��¼�ɹ����
			};
		}
		return false;//��¼�ɹ����
	}

}
