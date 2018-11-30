package com.xdl.p2p.front.invest.service;

import com.xdl.p2p.front.invest.entity.Investinfo;
import com.xdl.p2p.front.invest.entity.InvestinfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface InvestinfoMapper {
    long countByExample(InvestinfoExample example);

    int deleteByExample(InvestinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Investinfo record);

    int insertSelective(Investinfo record);

    List<Investinfo> selectByExample(InvestinfoExample example);

    Investinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Investinfo record, @Param("example") InvestinfoExample example);

    int updateByExample(@Param("record") Investinfo record, @Param("example") InvestinfoExample example);

    int updateByPrimaryKeySelective(Investinfo record);

    int updateByPrimaryKey(Investinfo record);

    //获取投资总金额
	Double getSumMoney(Map<String, Object> map);
	//获取投资总人数
	long getCountTmoney(Investinfo record);
}