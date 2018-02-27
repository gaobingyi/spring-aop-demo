package tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int changeBalance(String name, int balance) {
		String sql = "update account set balance = (balance + ?) where name = ?";
		return jdbcTemplate.update(sql, balance, name);
	}
}
