package com.nsu.tly.mapper;

import com.nsu.tly.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);
    
    Account selectByUserName(String username);//通过用户名查找用户

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}