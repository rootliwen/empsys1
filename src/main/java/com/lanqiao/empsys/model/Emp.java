package com.lanqiao.empsys.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName emp
 */
@Data
public class Emp {
    /**
     * 
     */
    private String empno;

    /**
     * 
     */
    private String ename;
    private String mname;
    private String dname;

    /**
     * 
     */
    private String job;

    /**
     * 
     */
    private String mgr;

    /**
     * 
     */
    private String hiredate;

    /**
     * 
     */
    private String sal;

    /**
     * 
     */
    private String comm;

    /**
     * 
     */
    private String deptno;

}