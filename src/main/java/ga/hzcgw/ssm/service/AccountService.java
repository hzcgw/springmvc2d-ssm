package ga.hzcgw.ssm.service;

import ga.hzcgw.ssm.dao.AccountDao;
import ga.hzcgw.ssm.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public Account selectById(Integer id){
        return accountDao.selectById(id);
    }

    public int saveAccount(Account account){
        return accountDao.save(account);
    }

    public int updateAccount(Account account){
        return accountDao.update(account);
    }

    public int deleteAccount(Integer id){
        return accountDao.delete(id);
    }
}
