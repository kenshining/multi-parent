package com.lxyw.authority.role.service;

/**
 * 生成和管理TOKEN
 */
public interface TokenService {

    /**
     * 使用用户ID生成访问TOKEN
     * @param userId 用户唯一标识
     * @return 创建成功的用户登录Token
     */
    public String createAccessToken(String userId);

    /**
     * 检索有效的用户Token，返回检索到的Token。
     * 如果返回null则可能用户Token已失效，需要重新认证。
     * @param userId 用户唯一标识
     * @return 查询成功的用户token或null
     */
    public String searchAccessTokenValid(String userId);

    /**
     * 验证用户Token是否有效
     * @param token 用户请求Token
     * @return 0 无效，1有效
     */
    public int validateAccessToken(String userId,String token);

    /**
     * 使用户失效，传入用户ID和Token
     * @param userId 用户唯一标识
     * @param token 当前token
     * @return 0 失败，1 成功
     */
    public int invalidToken(String userId,String token);
}
