package com.xdl.p2p.front.invest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 投资接口
 * @author likang
 * @date   2017-9-5 下午4:00:15
 */
@Service
public class InvestinfoService {
	
	@Autowired
	private InvestinfoMapper investinfoMapper;

	/**
	 * 投资总和
	 * @param map
	 * @return
	 */
	public Double getSumMoney(Map<String, Object> map){
		Double tm = investinfoMapper.getSumMoney(map);
		if (tm == null) {
			tm = new Double(0);
		}
		return tm;
	}
	
	public long getCountTmoney(){
		long countTM = investinfoMapper.getCountTmoney(null);
		return countTM;
	}
	
}
