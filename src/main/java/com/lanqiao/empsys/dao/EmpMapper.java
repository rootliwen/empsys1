package com.lanqiao.empsys.dao;

import com.lanqiao.empsys.model.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author liwen
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2022-02-08 18:43:52
* @Entity com.lanqiao.empsys.model.Emp
*/
public interface EmpMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectBySelective(@Param("emp") Emp record,
                                     @Param("pageNum") int pageNum,
                                     @Param("pageSize") int pageSize);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

}
