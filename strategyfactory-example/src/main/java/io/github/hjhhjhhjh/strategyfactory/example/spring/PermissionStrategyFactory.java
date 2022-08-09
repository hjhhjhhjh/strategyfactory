package io.github.hjhhjhhjh.strategyfactory.example.spring;

import io.github.hjhhjhhjh.strategyfactory.spring.SpringAutowriteHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * @author hjh
 * @version 1.0
 */
@Component
public class PermissionStrategyFactory extends SpringAutowriteHandlerFactory<String,BasePermissionHandler> {

}
