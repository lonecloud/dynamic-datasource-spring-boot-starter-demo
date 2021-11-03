package cn.lonecloud.dynamic.datasource.demo.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo
 * @Description: TODO
 * @date 2021/11/38:40 下午
 */
public interface UserMapper {

    @DS("mysql")
    @Select("select username from tbl_user")
    List<String> getUserName();

    @DS("pg")
    @Select("select name from tbl_product")
    List<String> selectPgList();

}
