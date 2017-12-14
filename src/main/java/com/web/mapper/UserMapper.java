package com.web.mapper;


import com.web.model.User;

import java.util.List;

public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateLockMoneyByPrimaryKey(User record);

    List<User> getUserPage(User user);

    int updateByMobile(User record);

    List<User> getUserCoachList(User user);

    List<User> getCollectionUserPage(User user);

    List<User> getVipUserPage(User user);

    User getPerformance(User user);

    List<User> getFinanciaDetailsPage(User user);

    User getMyCourse(User user);

    List<User> getUserResourceTime(User user);
}