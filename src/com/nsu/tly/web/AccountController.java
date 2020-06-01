package com.nsu.tly.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nsu.tly.entity.Account;
import com.nsu.tly.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("login")
	public String login(Account account,Model model) {
		if(accountService.loginCheck(account.getUsername(), account.getPassword())) {
			model.addAttribute("account",account);
			return "success";
		}
		model.addAttribute("msg","用户名或密码错误");
		return "login";
	}

}
