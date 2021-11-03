package cn.lonecloud.dynamic.datasource.demo.controller;

import cn.lonecloud.dynamic.datasource.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo.controller
 * @Description: 实例controller
 * @date 2021/11/38:43 下午
 */
@RequestMapping("/user")
@RestController
public class UserTestController {

    @Autowired
    private UserService userService;

    /**
     * 单独查询mysql
     * @return
     */
    @GetMapping("/selectMysql")
    public List<String> selectMysql() {
        return userService.getUserList();
    }
    /**
     * 单独查询pg
     * @return
     */
    @GetMapping("/selectPg")
    public List<String> selectPg() {
        return userService.pgList();
    }

    /**
     * 多数据源查询
     * @return
     */
    @GetMapping("/selectMix")
    public Map<String,List<String>> selectMix() {
        return userService.selectMix();
    }

}
