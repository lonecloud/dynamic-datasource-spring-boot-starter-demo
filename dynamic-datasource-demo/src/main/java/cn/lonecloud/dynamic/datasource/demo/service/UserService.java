package cn.lonecloud.dynamic.datasource.demo.service;

import java.util.List;
import java.util.Map;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo
 * @Description: TODO
 * @date 2021/11/38:42 下午
 */
public interface UserService {

    List<String> getUserList();

    List<String> pgList();


    Map<String,List<String>> selectMix();

}
