package com.borshcheva.webapp;


public class Request<HttpMethod> {
    private String uri;
    private HttpMethod method;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }


}
