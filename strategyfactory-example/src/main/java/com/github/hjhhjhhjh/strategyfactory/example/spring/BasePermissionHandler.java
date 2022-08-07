package com.github.hjhhjhhjh.strategyfactory.example.spring;

import com.github.hjhhjhhjh.strategyfactory.core.BaseHandlerKey;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
public interface BasePermissionHandler extends BaseHandlerKey<String> {
    void handler(String suffixStr);
}
