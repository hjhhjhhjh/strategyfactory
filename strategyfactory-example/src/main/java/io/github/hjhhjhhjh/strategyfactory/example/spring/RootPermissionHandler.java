package io.github.hjhhjhhjh.strategyfactory.example.spring;

import org.springframework.stereotype.Component;

/**
 * @author hjh
 * @version 1.0
 */
@Component
public class RootPermissionHandler implements BasePermissionHandler{
    @Override
    public String getKey() {
        return "root";
    }

    @Override
    public void handler(String suffixStr) {
        System.out.println("root handler print:"+suffixStr);
    }
}
