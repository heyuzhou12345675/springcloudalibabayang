package com.zcy.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.zcy.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * （自定义类描述）
 *
 * @author ATRI
 * @Date 2020-12-25 16:07
 **/

@RestController
public class ExcelController {

    @RequestMapping("")
    public void ExcelWrite(){


    }

}
