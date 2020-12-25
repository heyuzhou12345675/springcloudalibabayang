package com.zcy.dao;

import com.zcy.entity.AppDeHistory;
import com.zcy.entity.AppDeHistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AppDeHistoryMapper {
    long countByExample(AppDeHistoryExample example);

    int deleteByExample(AppDeHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppDeHistory record);

    int insertSelective(AppDeHistory record);

    List<AppDeHistory> selectByExample(AppDeHistoryExample example);

    AppDeHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppDeHistory record, @Param("example") AppDeHistoryExample example);

    int updateByExample(@Param("record") AppDeHistory record, @Param("example") AppDeHistoryExample example);

    int updateByPrimaryKeySelective(AppDeHistory record);

    int updateByPrimaryKey(AppDeHistory record);

    List<AppDeHistory> getAll();
}