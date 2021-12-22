package cn.lonecloud.dynamic.datasource.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo.entity
 * @Description: TODO
 * @date 2021/11/39:20 下午
 */
@TableName("tbl_user")
@Data
public class ProductEntity {

    @TableId
    private String id;

    private String name;

}
