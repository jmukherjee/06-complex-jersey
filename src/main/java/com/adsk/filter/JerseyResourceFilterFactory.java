package com.adsk.filter;

import com.sun.jersey.api.model.AbstractMethod;
import com.sun.jersey.spi.container.ResourceFilter;
import com.sun.jersey.spi.container.ResourceFilterFactory;

import java.util.List;

public class JerseyResourceFilterFactory implements ResourceFilterFactory {
    @Override
    public List<ResourceFilter> create(AbstractMethod abstractMethod) {
        return null;
    }
}
