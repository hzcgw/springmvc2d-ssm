package ga.hzcgw.ssm.dao;

import ga.hzcgw.ssm.po.User;

public interface UserDao {
    User queryUserByUserId(Integer userId);
}
