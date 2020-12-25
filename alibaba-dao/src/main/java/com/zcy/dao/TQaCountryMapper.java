package com.zcy.dao;

import com.zcy.entity.TQaCountry;
import com.zcy.entity.TQaCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQaCountryMapper {
    long countByExample(TQaCountryExample example);

    int deleteByExample(TQaCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQaCountry record);

    int insertSelective(TQaCountry record);

    List<TQaCountry> selectByExample(TQaCountryExample example);

    TQaCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQaCountry record, @Param("example") TQaCountryExample example);

    int updateByExample(@Param("record") TQaCountry record, @Param("example") TQaCountryExample example);

    int updateByPrimaryKeySelective(TQaCountry record);

    int updateByPrimaryKey(TQaCountry record);
}