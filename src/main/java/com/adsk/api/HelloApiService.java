package com.adsk.api;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
//@Api( value = "/hello", description = "print hello world")
public class HelloApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloPlain() {
        System.out.println("> api: HelloApiService:method invocation - plain");
        return "Hello from Jersey";
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getHelloXML() {
        System.out.println("> api: HelloApiService:method invocation - xml");
        return "<data>Hello from Jersey</data>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHelloHTML() {
        System.out.println("> api: HelloApiService:method invocation - html");
        return "<h1>Hello from Jersey</h1>";
    }
}
