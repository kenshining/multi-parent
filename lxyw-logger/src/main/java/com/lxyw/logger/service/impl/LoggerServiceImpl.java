package com.lxyw.logger.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lxyw.logger.entity.LoggerParams;
import com.lxyw.logger.entity.LoggerResult;
import com.lxyw.logger.service.LoggerService;

@Service(version = "1.0.0")
public class LoggerServiceImpl implements LoggerService {

    /**
     * 记录日志
     * @param loggerParams 日志参数
     * @return 记录结果
     */
    public LoggerResult recordLogger(LoggerParams loggerParams){
        LoggerResult result = new LoggerResult();
        result.setSerialno("1101029209183912");
        return result;
    }
}
