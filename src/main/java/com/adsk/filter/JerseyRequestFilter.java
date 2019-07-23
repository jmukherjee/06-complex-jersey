package com.adsk.filter;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class JerseyRequestFilter implements ContainerRequestFilter {
    @Override
    public ContainerRequest filter(ContainerRequest containerRequest) {
        System.out.println("> api: JerseyRequestFilter:filter");
        return containerRequest;
    }
}