package org.com.it.Service.Impl;

import org.com.it.Dao.Impl.UserNameImpl;
import org.com.it.Dao.UserName;
import org.com.it.Service.Service;

public class ServiceImpl implements Service {
    @Override
    public void loginUser(String username, String password) {
        UserName userName = new UserNameImpl();
        
    }
}
