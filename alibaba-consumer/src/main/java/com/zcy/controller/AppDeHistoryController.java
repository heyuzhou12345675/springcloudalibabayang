package com.zcy.controller;

import com.zcy.entity.AppDeHistory;
import com.zcy.entity.TAppDeVedio;
import com.zcy.service.AppDeHistorySerivce;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * （预定义演示类）
 *  通过url的方式请求
 * @author ATRI
 * @Date 2020-12-17 10:46
 **/


@RestController
public class AppDeHistoryController {

    @Autowired
//    @Reference
    private AppDeHistorySerivce appDeHistorySerivce;

    @RequestMapping("/getList")
    public List<AppDeHistory> getList(AppDeHistory appDeHistory){
        List<AppDeHistory> list = appDeHistorySerivce.getList(appDeHistory);
        return list;
    }

    /**
     * 传单参数*/
    @RequestMapping("/getListByChannel")
    public List<AppDeHistory> getListByChannel(String channel){
        List<AppDeHistory> list= appDeHistorySerivce.getListByChannel(channel);
        return list;
    }
    /**
    * 传对象*/
    @RequestMapping("/getListByAppDeHistory")
    public List<AppDeHistory> getListByAppDeHistory(AppDeHistory appDeHistory){
        List<AppDeHistory> list= appDeHistorySerivce.getListByAppDeHistory(appDeHistory);
        return list;
    }



    @RequestMapping("/insertHistory")
    public int insertHistory(AppDeHistory appDeHistory){
        appDeHistory.setId("test001");
        return 0;
    }

    @RequestMapping("/insertVideo")
    public int insertVideo(TAppDeVedio appDeVedio){
        appDeVedio.setId(0);
        appDeVedio.setTitle("我就不信不能为0");
        int i = appDeHistorySerivce.insertOneVideo(appDeVedio);
        System.out.println("返回结果为"+i);
        return 0;
    }
}
