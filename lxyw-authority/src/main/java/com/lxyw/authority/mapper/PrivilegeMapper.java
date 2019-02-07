package com.lxyw.authority.mapper;

import com.lxyw.authority.config.mybatis.CommonMapper;
import com.lxyw.authority.entity.Privilege;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PrivilegeMapper extends CommonMapper<Privilege> {
}
