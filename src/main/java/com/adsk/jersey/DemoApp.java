package com.adsk.jersey;

import com.adsk.api.HelloApiService;
//import io.swagger.jaxrs.config.BeanConfig;
//import io.swagger.jaxrs.listing.ApiListingResource;
//import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class DemoApp extends Application {
//    public DemoApp() {
//        BeanConfig beanConfig = new BeanConfig();
//        beanConfig.setVersion("1.0");
//        beanConfig.setSchemes(new String[]{"http"});
//        //beanConfig.setHost("localhost:9082");
//        beanConfig.setBasePath("/swagger");
//        beanConfig.setResourcePackage("com.adsk.api");
//        beanConfig.setScan(true);
//    }
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> yourResources = new HashSet<Class<?>>();
        yourResources.add(HelloApiService.class);
//        yourResources.add(ApiListingResource.class);
//        yourResources.add(SwaggerSerializers.class);
        return yourResources;
    }
}
