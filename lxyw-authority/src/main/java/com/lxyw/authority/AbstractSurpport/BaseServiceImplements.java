package com.lxyw.authority.AbstractSurpport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BaseServiceImplements<T extends BaseEntity> implements IBaseService<T>{

    public String getInvokClassName(){
        //根据反射原理取得CLASSNAME
        Class < T >  entityClass  =  (Class < T > ) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[ 0 ];
        return entityClass.getName();
    }

}
