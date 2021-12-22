package cn.lonecloud.dynamic.datasource.demo.controller;

import cn.lonecloud.dynamic.datasource.demo.service.DataSourceAService;
import cn.lonecloud.dynamic.datasource.demo.service.DataSourceBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author lonecloud
 * @version v1.0
 * @date 2021/12/22 10:00 上午
 */
@RestController
public class MixController {

    @Autowired
    private DataSourceAService dataSourceAService;
    @Autowired
    private DataSourceBService dataSourceBService;

    @GetMapping("/test")
    public void test(){
        dataSourceAService.getUser();
        dataSourceBService.getUser();
    }
}
