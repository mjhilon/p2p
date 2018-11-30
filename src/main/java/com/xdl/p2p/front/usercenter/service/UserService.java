package com.xdl.p2p.front.usercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.p2p.front.usercenter.entity.User;
import com.xdl.p2p.front.usercenter.entity.UserExample;
import com.xdl.p2p.front.usercenter.entity.UserExample.Criteria;
import com.xdl.p2p.publics.util.MD5Tools;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	/**
	 * 根据用户手机号查询用户信息
	 * @param phone
	 * @return
	 */
	public User queryUserByPhone(String phone){
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		List<User> userlist = userMapper.selectByExample(userExample);
		if (userlist != null && userlist.size() > 0) {
			return userlist.get(0);
		}
		return null;
	}
	
	/**
	 *  验证密码是否匹配
	 * @param phone
	 * @param password
	 * @return
	 */
	public boolean isPasswordMatch(String phone, String password) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		criteria.andPasswordEqualTo(MD5Tools.encode(password));
		List<User> userlist = userMapper.selectByExample(userExample);
		if (userlist != null && userlist.size() > 0) {
			return true;
		}
		return false;
	}

	public void saveUser(User user) {
		user.setPassword(MD5Tools.encode(user.getPassword()));
		userMapper.insert(user);
	
	}
	
	
}
