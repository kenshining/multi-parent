package com.lxyw.authority.AbstractSurpport;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IBaseGenericDao <T extends BaseEntity>{

    public Integer insert(T var1);

    public Integer insertBatch(List<T> var1);

    public Integer update(T var1);

    public Integer updateBatch(List<T> var1);

    public T selectById(Serializable var1);

    public List<T> selectByMap(Map<String, Object> var1);

    public T selectOne(Map<String, Object> var1);

    public Integer delete(Serializable var1);

    public Integer deleteByMap(Map<String, Object> var1);

    public Integer deleteBatchIds(Collection<? extends Serializable> ids);

}
