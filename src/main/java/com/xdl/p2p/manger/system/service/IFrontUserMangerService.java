package com.xdl.p2p.manger.system.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.p2p.front.usercenter.entity.User;
import com.xdl.p2p.front.usercenter.entity.UserExample;
import com.xdl.p2p.front.usercenter.entity.UserExample.Criteria;
import com.xdl.p2p.front.usercenter.service.UserMapper;

@Service
public class IFrontUserMangerService {
	
	@Autowired
	UserMapper frontuserMangerMapper;

	public User queryfrontUserMangerByPhone(String phone) {
		UserExample frontuserMangerExample = new UserExample();
		Criteria criteria = frontuserMangerExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		List<User> list = frontuserMangerMapper.selectByExample(frontuserMangerExample);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	public List<User> queryfrontUserMangerList() {
		return frontuserMangerMapper.selectByExample(null);
	}
	
	public void userStop(User userManger) {
		frontuserMangerMapper.updateByPrimaryKeySelective(userManger);
	}
	
	
}
