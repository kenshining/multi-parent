package com.lxyw.authority.mapper;

import com.lxyw.authority.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserInfoMapper extends CommonMapper<UserInfo>{
}
