package com.aode.dao;

import com.aode.bean.Registration_department;
import com.aode.bean.Registration_departmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Registration_departmentMapper {
    long countByExample(Registration_departmentExample example);

    int deleteByExample(Registration_departmentExample example);

    int deleteByPrimaryKey(Integer reginfoId);

    int insert(Registration_department record);

    int insertSelective(Registration_department record);

    List<Registration_department> selectByExample(Registration_departmentExample example);

    Registration_department selectByPrimaryKey(Integer reginfoId);

    int updateByExampleSelective(@Param("record") Registration_department record, @Param("example") Registration_departmentExample example);

    int updateByExample(@Param("record") Registration_department record, @Param("example") Registration_departmentExample example);

    int updateByPrimaryKeySelective(Registration_department record);

    int updateByPrimaryKey(Registration_department record);
}