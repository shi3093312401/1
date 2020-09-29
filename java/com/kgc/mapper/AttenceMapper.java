package com.kgc.mapper;

import com.kgc.pojo.Attence;
import com.kgc.pojo.AttenceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttenceMapper {
    int countByExample(AttenceExample example);

    int deleteByExample(AttenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Attence record);

    int insertSelective(Attence record);

    List<Attence> selectByExample(AttenceExample example);

    Attence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByExample(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByPrimaryKeySelective(Attence record);

    int updateByPrimaryKey(Attence record);
}