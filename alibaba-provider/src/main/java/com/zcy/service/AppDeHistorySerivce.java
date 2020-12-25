package com.zcy.service;

import com.zcy.entity.AppDeHistory;
import com.zcy.entity.TAppDeVedio;

import java.util.List;

/**
 * （自定义类描述）
 *
 * @author ATRI
 * @Date 2020-12-17 10:29
 **/
public interface AppDeHistorySerivce {
    List<AppDeHistory> getList(AppDeHistory appDeHistory);
    int insertOne(AppDeHistory appDeHistory);

    int insertOneVideo(TAppDeVedio tAppDeVedio);

    List<AppDeHistory> getListByChannel(String channel);

    List<AppDeHistory> getListByAppDeHistory(AppDeHistory appDeHistory);
}
