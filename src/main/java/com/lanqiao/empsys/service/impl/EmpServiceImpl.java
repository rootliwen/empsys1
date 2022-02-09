package com.lanqiao.empsys.service.impl;
import com.lanqiao.empsys.dao.EmpMapper;
import com.lanqiao.empsys.model.Emp;
import com.lanqiao.empsys.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* @author liwen
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2022-02-08 18:42:52
*/
@Service("employeeService")
public class EmpServiceImpl implements IEmpService {

    @Autowired(required = false)
    EmpMapper empMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return empMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    @Override
    public Emp selectByPrimaryKey(Integer id) {
        return empMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Emp> selectBySelective(Emp record, int pageNum, int pageSize) {
        return empMapper.selectBySelective(record, pageNum, pageSize);
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return empMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return empMapper.updateByPrimaryKey(record);
    }
}




