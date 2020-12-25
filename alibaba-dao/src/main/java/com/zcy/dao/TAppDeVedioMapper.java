package com.zcy.dao;

import com.zcy.entity.TAppDeVedio;
import com.zcy.entity.TAppDeVedioExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TAppDeVedioMapper {
    long countByExample(TAppDeVedioExample example);

    int deleteByExample(TAppDeVedioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAppDeVedio record);

    int insertSelective(TAppDeVedio record);

    List<TAppDeVedio> selectByExample(TAppDeVedioExample example);

    TAppDeVedio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAppDeVedio record, @Param("example") TAppDeVedioExample example);

    int updateByExample(@Param("record") TAppDeVedio record, @Param("example") TAppDeVedioExample example);

    int updateByPrimaryKeySelective(TAppDeVedio record);

    int updateByPrimaryKey(TAppDeVedio record);
}