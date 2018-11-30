package com.xdl.p2p.manger.system.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.p2p.manger.system.entity.UserManger;
import com.xdl.p2p.manger.system.entity.UserMangerExample;
import com.xdl.p2p.manger.system.entity.UserMangerExample.Criteria;
import com.xdl.p2p.publics.util.MD5Tools;

@Service
public class IUserMangerService {
	
	@Autowired
	UserMangerMapper userMangerMapper;

	public UserManger queryUserMangerByPhone(String phone) {
		UserMangerExample userMangerExample = new UserMangerExample();
		Criteria criteria = userMangerExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		List<UserManger> list = userMangerMapper.selectByExample(userMangerExample);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	public boolean isPasswordMatch(String phone, String passwordm) {
		UserMangerExample userMangerExample = new UserMangerExample();
		Criteria criteria = userMangerExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		criteria.andPasswordmEqualTo(MD5Tools.encode(passwordm));
		List<UserManger> userlist = userMangerMapper.selectByExample(userMangerExample);
		if (userlist != null && userlist.size() > 0) {
			return true;
		}
		return false;
	}
	
	public List<UserManger> queryUserMangerList() {
		return userMangerMapper.selectByExample(null);
	}
	public void saveUser(UserManger userManger) {
		userManger.setDr(1);
		userManger.setPasswordm(MD5Tools.encode("123123"));
		userManger.setCreatetime(new Timestamp(System.currentTimeMillis()));
		userMangerMapper.insert(userManger);
	}
	public void deleteUserById(String useridm) {
		userMangerMapper.deleteByPrimaryKey(Long.valueOf(useridm));
	}
	public void userStop(UserManger userManger) {
		userMangerMapper.updateByPrimaryKeySelective(userManger);
	}
	
	
}
