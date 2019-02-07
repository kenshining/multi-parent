package com.lxyw.authority.role.service;

import com.lxyw.authority.LxywAuthorityApplicationTests;
import com.lxyw.authority.entity.GroupUserRole;
import com.lxyw.authority.entity.Privilege;
import com.lxyw.authority.entity.Role;
import com.lxyw.authority.entity.UserInfo;
import com.lxyw.authority.mapper.GroupUserRoleMapper;
import com.lxyw.authority.mapper.PrivilegeMapper;
import com.lxyw.authority.mapper.RoleMapper;
import com.lxyw.authority.mapper.UserInfoMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.UUID;

public class SqlTests extends LxywAuthorityApplicationTests {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    PrivilegeMapper privilegeMapper;

    @Autowired
    GroupUserRoleMapper groupUserRoleMapper;

    @Before
    public void prepareDatas(){
        UserInfo user = new UserInfo();
        user.setId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        user.setEmail("kencheng@foxmail.com");
        user.setUsername("kencheng");
        user.setMobile("18611699091");
        user.setStuffNo("0001");
        user.setPassword("passwords");
        userInfoMapper.insert(user);

        Role role = new Role();
        role.setId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        role.setRoleCode("0001");
        role.setStatus(0);
        role.setRoleName("测试权限");
        roleMapper.insert(role);

        Privilege privilege = new Privilege();
        privilege.setId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        privilege.setPrivilegeCode("MENU012");
        privilege.setPrivilegeName("权限1");
        privilege.setPrivilegeType("0");
        privilege.setPrivilegeUrl("/lxyw/auth/test");
        privilegeMapper.insert(privilege);

        GroupUserRole groupUserRole = new GroupUserRole();
        groupUserRole.setId(UUID.randomUUID().toString().toUpperCase());
        groupUserRole.setRoleId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        groupUserRole.setUserId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        groupUserRole.setRemarks("测试备注");
        groupUserRoleMapper.insert(groupUserRole);

    }

    @Test
    public void selectTest() throws Exception{
        List<UserInfo> users = userInfoMapper.selectAll();
        logger.info(users.get(0).getUsername());
        List<Role> roles = roleMapper.selectAll();
        logger.info(roles.get(0).getRoleName());
        logger.info(roles.get(0).getRoleCode());

        //update test
        UserInfo user = users.get(0);
        user.setStuffNo("0002");
        user.setPassword("passwords1");
        userInfoMapper.updateByPrimaryKey(user);

        //search modified data
        UserInfo param = new UserInfo();
        param.setStuffNo("0002");
        UserInfo resultUser = userInfoMapper.selectOne(param);
        logger.info(resultUser.getUsername());

        GroupUserRole groupUserRoleParam = new GroupUserRole();
        groupUserRoleParam.setRemarks("测试备注");
        GroupUserRole groupUserRole = groupUserRoleMapper.selectOne(groupUserRoleParam);
        logger.info(groupUserRole.getRoleId());
        logger.info(groupUserRole.getUserId());
    }
}
