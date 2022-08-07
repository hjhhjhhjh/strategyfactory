package io.github.hjhhjhhjh.strategyfactory.example.spring;

import io.github.hjhhjhhjh.strategyfactory.core.BaseHandlerKey;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
public interface BasePermissionHandler extends BaseHandlerKey<String> {
    void handler(String suffixStr);
}
