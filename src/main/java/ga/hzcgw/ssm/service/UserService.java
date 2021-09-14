package ga.hzcgw.ssm.service;

import ga.hzcgw.ssm.dao.UserDao;
import ga.hzcgw.ssm.exception.ParamsException;
import ga.hzcgw.ssm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUserByUserId(Integer userId){
        /*if (true){
            throw new ParamsException();
        }*/
        return userDao.queryUserByUserId(userId);
    }

}
