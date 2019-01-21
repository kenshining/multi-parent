package com.lxyw.logger.service;

import com.lxyw.logger.entity.LoggerParams;
import com.lxyw.logger.entity.LoggerResult;

public interface LoggerService {

    /**
     * 记录日志
     * @param loggerParams 日志参数
     * @return 记录结果
     */
    public LoggerResult recordLogger(LoggerParams loggerParams);
}
