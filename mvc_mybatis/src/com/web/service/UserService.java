package com.web.service;

import java.util.List;

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
public interface UserService {
    
    // 获取整个表的数据
    List<User> getAll() throws Exception;
    
    // 通过表id获取表的数据
    User getUserById(int id) throws Exception;

}
