package com.zcy.service.impl;

import com.zcy.dao.AppDeHistoryMapper;
import com.zcy.dao.TAppDeVedioMapper;
import com.zcy.entity.AppDeHistory;
import com.zcy.entity.AppDeHistoryExample;
import com.zcy.entity.TAppDeVedio;
import com.zcy.service.AppDeHistorySerivce;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * （自定义类描述）
 *
 * @author ATRI
 * @Date 2020-12-17 10:30
 **/

@Service
public class AppDeHistoryImpl implements AppDeHistorySerivce {
    @Autowired
    private AppDeHistoryMapper appDeHistoryMapper;
    @Autowired
    private TAppDeVedioMapper appDeVedioMapper;
    @Override
    public List<AppDeHistory> getList(AppDeHistory appDeHistory) {
        List<AppDeHistory> list = appDeHistoryMapper.getAll();
        return list;
    }

    @Override
    public int insertOne(AppDeHistory appDeHistory) {
        int insert = appDeHistoryMapper.insert(appDeHistory);
        return insert;
    }

    @Override
    public int insertOneVideo(TAppDeVedio tAppDeVedio) {
        return appDeVedioMapper.insert(tAppDeVedio);
    }

    @Override
    public List<AppDeHistory> getListByChannel(String channel) {
        AppDeHistoryExample example=new AppDeHistoryExample();
        AppDeHistoryExample.Criteria criteria = example.createCriteria();
        criteria.andCChannelEqualTo(channel);
        return appDeHistoryMapper.selectByExample(example);
    }

    @Override
    public List<AppDeHistory> getListByAppDeHistory(AppDeHistory appDeHistory) {
        AppDeHistoryExample example=new AppDeHistoryExample();
        AppDeHistoryExample.Criteria criteria = example.createCriteria();
        criteria.andCChannelEqualTo(appDeHistory.getcChannel());
        return appDeHistoryMapper.selectByExample(example);
    }
}
