package org.com.it.Service.Impl;

import org.com.it.Dao.Impl.UserNameImpl;
import org.com.it.Dao.UserName;
import org.com.it.Service.Service;
import org.com.it.pojo.User;

public class ServiceImpl implements Service {
    UserName user = new UserNameImpl();
    @Override
    public User loginUser(String username, String password) {
        User us=user.LoginUser(username,password);
        return us;
    }
}
