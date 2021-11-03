package cn.lonecloud.dynamic.datasource.demo.service;

import cn.lonecloud.dynamic.datasource.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo.service
 * @Description: TODO
 * @date 2021/11/38:42 下午
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserMapper userMapper;
    @Override
    public List<String> getUserList() {
        return userMapper.getUserName();
    }

    @Override
    public List<String> pgList() {
        return userMapper.selectPgList();
    }

    @Override
    public Map<String, List<String>> selectMix() {
        List<String> userName = userMapper.getUserName();
        List<String> strings = userMapper.selectPgList();
        Map<String,List<String>> dataMap=new HashMap<>();
        dataMap.put("mysql",userName);
        dataMap.put("pg",strings);
        return dataMap;
    }
}
