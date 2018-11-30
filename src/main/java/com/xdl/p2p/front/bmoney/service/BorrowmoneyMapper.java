package com.xdl.p2p.front.bmoney.service;

import com.xdl.p2p.front.bmoney.entity.Borrowmoney;
import com.xdl.p2p.front.bmoney.entity.BorrowmoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowmoneyMapper {
    long countByExample(BorrowmoneyExample example);

    int deleteByExample(BorrowmoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Borrowmoney record);

    int insertSelective(Borrowmoney record);

    List<Borrowmoney> selectByExample(BorrowmoneyExample example);

    Borrowmoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Borrowmoney record, @Param("example") BorrowmoneyExample example);

    int updateByExample(@Param("record") Borrowmoney record, @Param("example") BorrowmoneyExample example);

    int updateByPrimaryKeySelective(Borrowmoney record);

    int updateByPrimaryKey(Borrowmoney record);
    
    //获取借款人数
    long getCountBmoney();
    
}