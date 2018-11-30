package com.xdl.p2p.front.bmoney.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 借款接口
 * @author likang
 * @date   2017-9-7 下午4:17:14
 */
@Service
public class BorrowmoneyService {
	
	@Autowired
	private BorrowmoneyMapper borrowmoneyMapper;
	
	/**
	 * 获取借款总人数
	 * @return
	 */
	public long getCountBmoney(){
		return borrowmoneyMapper.getCountBmoney();
	}

}
