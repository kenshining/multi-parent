package com.lxyw.authority.role.service.impl;

import com.lxyw.authority.role.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("tokenService")
public class TokenServiceImpl implements TokenService {

    //日志输出LOGBACK
    protected static Logger logger = LoggerFactory.getLogger(TokenService.class);


    /**
     * 使用用户ID生成访问TOKEN
     * @param userId 用户唯一标识
     * @return 创建成功的用户登录Token
     */
    public String createAccessToken(String userId){
        //生成用户ID，为防止重复则增加userId以保证其唯一性
        if(userId != null && !userId.trim().equals("")){
            //使用UUID生成令牌，附带userID组成令牌
            String token = UUID.randomUUID().toString().replace("-", "").concat("-").concat(userId);
            //TODO 将令牌以键值对的形式存储到Redis中，设置有效期。
            return token.toUpperCase();
        }
        return null;
    }

    /**
     * 检索有效的用户Token，返回检索到的Token。
     * 如果返回null则可能用户Token已失效，需要重新认证。
     * @param userId 用户唯一标识
     * @return 查询成功的用户token或null
     */
    public String searchAccessTokenValid(String userId){
        return null;
    }

    /**
     * 验证用户Token是否有效
     * @param token 用户请求Token
     * @return 0 无效，1有效
     */
    public int validateAccessToken(String userId,String token){
        return 0;
    }

    /**
     * 使用户失效，传入用户ID和Token
     * @param userId 用户唯一标识
     * @param token 当前token
     * @return 0 失败，1 成功
     */
    public int invalidToken(String userId,String token){
        return 0;
    }
}
