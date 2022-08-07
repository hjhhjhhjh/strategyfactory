package com.github.hjhhjhhjh.strategyfactory.example.spring;

import org.springframework.stereotype.Component;

/**
 * @Author hjh
 * @Description TODO
 * @Version 1.0
 */
@Component
public class NonRootPermissionHandler implements BasePermissionHandler{
    @Override
    public String getKey() {
        return "nonroot";
    }

    @Override
    public void handler(String suffixStr) {
        System.out.println("nonroot handler print:"+suffixStr);
    }
}
