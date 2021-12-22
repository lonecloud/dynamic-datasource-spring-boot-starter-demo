package cn.lonecloud.dynamic.datasource.demo.dao;

import cn.lonecloud.dynamic.datasource.demo.entity.UserEntity;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo
 * @Description: TODO
 * @date 2021/11/38:40 下午
 */
public interface UserMixMapper extends BaseMapper<UserEntity> {

    @Select("select username from tbl_user")
    List<String> getUserName();


}
