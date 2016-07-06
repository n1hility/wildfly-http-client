package org.wildfly.ejb.http;

import java.util.Arrays;
import java.util.Map;

/**
 *
 *
 * @author Stuart Douglas
 */
public class TestEJBInvocation {

    private final String app;
    private final String module;
    private final String distict;
    private final String bean;
    private final String beanId;
    private final String sessionAffinity;
    private final Class<?> view;
    private final String method;
    private final Class[] paramTypes;
    private final Object[] params;
    private final Map<?, ?> privateAttachments;
    private final Map<String, Object> contextData;

    public TestEJBInvocation(String app, String module, String distict, String bean, String beanId, String sessionAffinity, Class<?> view, String method, Class[] paramTypes, Object[] params, Map<?, ?> privateAttachments, Map<String, Object> contextData) {
        this.app = app;
        this.module = module;
        this.distict = distict;
        this.bean = bean;
        this.beanId = beanId;
        this.sessionAffinity = sessionAffinity;
        this.view = view;
        this.method = method;
        this.paramTypes = paramTypes;
        this.params = params;
        this.privateAttachments = privateAttachments;
        this.contextData = contextData;
    }

    public String getApp() {
        return app;
    }

    public String getModule() {
        return module;
    }

    public String getDistict() {
        return distict;
    }

    public String getBean() {
        return bean;
    }

    public String getBeanId() {
        return beanId;
    }

    public Class<?> getView() {
        return view;
    }

    public String getMethod() {
        return method;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public Object[] getParams() {
        return params;
    }

    public Map<?, ?> getPrivateAttachments() {
        return privateAttachments;
    }

    public Map<String, Object> getContextData() {
        return contextData;
    }

    public String getSessionAffinity() {
        return sessionAffinity;
    }

    @Override
    public String toString() {
        return "TestEJBInvocation{" +
                ", app='" + app + '\'' +
                ", module='" + module + '\'' +
                ", distict='" + distict + '\'' +
                ", bean='" + bean + '\'' +
                ", beanId='" + beanId + '\'' +
                ", view=" + view +
                ", method='" + method + '\'' +
                ", paramTypes=" + Arrays.toString(paramTypes) +
                ", params=" + Arrays.toString(params) +
                ", privateAttachments=" + privateAttachments +
                ", contextData=" + contextData +
                '}';
    }
}
