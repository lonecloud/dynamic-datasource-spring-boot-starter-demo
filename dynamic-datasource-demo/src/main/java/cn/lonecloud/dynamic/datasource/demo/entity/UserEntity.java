package cn.lonecloud.dynamic.datasource.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lonecloud
 * @version v1.0
 * @Package cn.lonecloud.dynamic.datasource.demo.entity
 * @Description: TODO
 * @date 2021/11/39:20 下午
 */
@TableName("tbl_user")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @TableId(type = IdType.AUTO)
    private String id;

    private String username;

}
