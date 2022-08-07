package io.github.hjhhjhhjh.strategyfactory.spring;

import io.github.hjhhjhhjh.strategyfactory.core.BaseFectory;
import io.github.hjhhjhhjh.strategyfactory.core.BaseHandlerKey;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
public abstract class SpringAutowriteHandlerFactory<E, T extends BaseHandlerKey<E>> extends BaseFectory<E, T> implements InitializingBean {
    /**
     * 有可能没有实现类,所以required = false
     */
    @Autowired(required = false)
    protected List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public void afterPropertiesSet() {
        initHandler();
    }

    @Override
    protected void initHandler() {
        Map<E, T> listHandler = getListHandler();
        if (list != null) {
            list.forEach(n -> listHandler.put(n.getKey(), n));
        }
    }
}
