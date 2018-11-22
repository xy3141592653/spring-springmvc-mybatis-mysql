package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mapper.UserMapper;
import com.web.po.User;

/**
 *
 * 类描述：
 *
 * @author zhao.gang
 * @date 2018年11月10日
 * 
 * 修改描述：
 * @modifier
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<User> getAll() throws Exception {
        // TODO Auto-generated method stub
        // 这里不写了 如果想在jsp中显示list，可以引入jstl标签进行操作显示，记得加入jstl的包 jstl-1.2.jar
        return null;
    }

    @Override
    public User getUserById(int id) throws Exception {
        // TODO Auto-generated method stub
        
        // 通过userMapper获取数据
        User user = userMapper.getUserById(id);        
        return user;
    }

}
