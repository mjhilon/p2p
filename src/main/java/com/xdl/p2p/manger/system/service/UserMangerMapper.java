package com.xdl.p2p.manger.system.service;

import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.entity.UserMangerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMangerMapper {
    long countByExample(UserMangerExample example);

    int deleteByExample(UserMangerExample example);

    int deleteByPrimaryKey(Long useridm);

    int insert(UserManger record);

    int insertSelective(UserManger record);

    List<UserManger> selectByExample(UserMangerExample example);

    UserManger selectByPrimaryKey(Long useridm);

    int updateByExampleSelective(@Param("record") UserManger record, @Param("example") UserMangerExample example);

    int updateByExample(@Param("record") UserManger record, @Param("example") UserMangerExample example);

    int updateByPrimaryKeySelective(UserManger record);

    int updateByPrimaryKey(UserManger record);
}