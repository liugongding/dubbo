package com.dingding.seckill.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */

@Data
@ToString
public class User implements Serializable {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

    /**
     * 显示时间
     */
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date time;

    /**
     * 电话
     */
    private Long phone;

}
