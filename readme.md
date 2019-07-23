# Tutorial - Jersey

## IntelliJ Steps
* File > New > Project
* Java Enterprise > Java EE 7 > Web Application checked & web.xml
* Right Click on project > Add Framework Support > Maven
* update pom.xml with jersey dependencies
* Select src -> main -> java and Choose Source root
* Create package
* Update web.xml with Servlet pointing to Jersey Container

### Jersey Request LifeCycle
* Path’s are matched with Resource classes.
* Constructor is called.
* Dependencies are injected.
* Appropriate method is called.
* Resource is garbage collected.

```
request   ->   pre-matching   ->   post-matching   ->    reader     -> message body   -\
                req filter          resp filter        interceptor       reader         |
                                                                                      method invocation
                                                                                        |
response  <-        <-        <-    message body   <-    write      <- response   <-  -/
                                       writer           interceptor     filter
```