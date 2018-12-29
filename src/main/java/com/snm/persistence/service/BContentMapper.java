package com.snm.persistence.service;

import com.snm.persistence.po.BContent;
import com.snm.persistence.po.BContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BContentMapper {
    long countByExample(BContentExample example);

    int deleteByExample(BContentExample example);

    int insert(BContent record);

    int insertSelective(BContent record);

    List<BContent> selectByExample(BContentExample example);

    int updateByExampleSelective(@Param("record") BContent record, @Param("example") BContentExample example);

    int updateByExample(@Param("record") BContent record, @Param("example") BContentExample example);
}