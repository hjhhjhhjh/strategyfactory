package com.github.hjhhjhhjh.strategyfactory.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
public abstract class BaseFectory<E, T extends BaseHandlerKey<E>> {
    private final Map<E, T> listHandler = new HashMap<>();

    public Map<E, T> getListHandler() {
        return listHandler;
    }

    /**
     * 根据实例类型获取对应的处理类
     *
     * @return
     */
    public T getInstance(E type) {
        T handler = listHandler.get(type);
        if (handler == null) {
            return null;
        }
        return handler;
    }

    protected abstract void initHandler();

}
