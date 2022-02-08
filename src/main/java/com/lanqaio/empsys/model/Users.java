package com.lanqaio.empsys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private Integer id;
    private String username;
    private String password;
}
