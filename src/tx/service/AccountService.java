package tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tx.dao.AccountDao;

@Transactional
@Service
public class AccountService {
	
	@Autowired
	private AccountDao accountDao;
	
	public void transferAccount(String from, String to, int balance) {
		accountDao.changeBalance(from, -balance);
		System.out.println("扣款成功");
		@SuppressWarnings("unused")
		int i = 1/0;
		accountDao.changeBalance(to, +balance);
		System.out.println("收款成功");
	}
	
}
