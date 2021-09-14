package ga.hzcgw.ssm.dao;

import ga.hzcgw.ssm.po.Account;

public interface AccountDao {
    public Account selectById(Integer id);

    public int save(Account account);

    public  int update(Account account);

    public int delete(Integer id);
}
