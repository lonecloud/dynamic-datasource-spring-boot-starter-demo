package cn.lonecloud.dynamic.datasource.demo.service;

import cn.lonecloud.dynamic.datasource.demo.dao.UserMixMapper;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author lonecloud
 * @version v1.0
 * @date 2021/12/2210:02 上午
 */
@DS("pg")
@Service
public class DataSourceBService {

    @Autowired
    private UserMixMapper userMixMapper;

    public List<String> getUser() {
        return userMixMapper.getUserName();
    }

}
