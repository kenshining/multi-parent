package com.lxyw.authority.AbstractSurpport;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.*;

public class BaseGenericDaoImplements<T extends BaseEntity> extends SqlSessionDaoSupport{

    public static final String SQLNAME_SEPARATOR = ".";

    /**
     * 不能用于SQL中的非法字符（主要用于排序字段名）
     */
    public static final String[] ILLEGAL_CHARS_FOR_SQL = {",", ";", " ", "\"", "%"};

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /**
     * 获取默认SqlMapping命名空间。
     * 使用泛型参数中业务实体类型的全限定名作为默认的命名空间。
     * 如果实际应用中需要特殊的命名空间，可由子类重写该方法实现自己的命名空间规则。
     *
     * @return 返回命名空间字符串
     */
    @SuppressWarnings("unchecked")
    protected String getDefaultSqlNamespace() {
        //根据反射原理取得CLASSNAME
        Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
        return entityClass.getName();
    }

    /**
     * 将SqlMapping命名空间与给定的SqlMapping名组合在一起。
     *
     * @param sqlName SqlMapping名
     * @return 组合了SqlMapping命名空间后的完整SqlMapping名
     */
    protected String getSqlName(String sqlName) {
        String sqlNamespace = this.getDefaultSqlNamespace();
        return sqlNamespace + SQLNAME_SEPARATOR + sqlName;
    }

    /**
     * 获取SqlMapping命名空间
     *
     * @return SqlMapping命名空间
     */
    public String getSqlNamespace() {
        return getDefaultSqlNamespace();
    }

    /**
     * 生成主键值。
     * 默认情况下什么也不做；
     * 如果需要生成主键，需要由子类重写此方法根据需要的方式生成主键值。
     *
     * @param ob 要持久化的对象
     */
    protected void generateId(T ob) {
        ob.setId(UUID.randomUUID().toString());
    }


    public Integer insert(T var1) {
        return this.getSqlSession().insert(
                getSqlName("insert"), var1);
    }

    public Integer insertBatch(List<T> var1){
        return this.getSqlSession().insert(
                getSqlName("insertBatch"), var1);
    }

    public Integer update(T var1) {
        return this.getSqlSession().update(
                getSqlName("update"), var1);
    }

    public Integer updateBatch(List<T> var1) {
        return this.getSqlSession().update(
                getSqlName("updateBatch"), var1);
    }

    public T selectById(Serializable var1){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("id",var1);
        return this.getSqlSession().selectOne("select",params);
    }

    public T selectOne(Map<String, Object> var1){
        return this.getSqlSession().selectOne(getSqlName("select"),var1);
    }

    public List<T> selectByMap(Map<String, Object> var1){
        return this.getSqlSession().selectList(getSqlName("select"),var1);
    }

    public Integer delete(Serializable id){
        return this.getSqlSession().delete(getSqlName("delete"),id);
    }

    public Integer deleteByMap(Map<String, Object> var1){
        return this.getSqlSession().delete(getSqlName("delete"),var1);
    }

    public Integer deleteBatchIds(Collection<? extends Serializable> ids){
        return this.getSqlSession().delete(getSqlName("deleteBatch"),ids);
    }



}
