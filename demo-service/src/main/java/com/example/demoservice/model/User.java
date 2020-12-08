package com.example.demoservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -7291508790203233996L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;
}
