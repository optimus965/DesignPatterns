package creationalDesignPatterns.builderPattern;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String url;
    private final String method;
    private final Map<String,String> queryParams;
    private final Map<String,String> headers;
    private final String body;
    private final int timeout;
    public String getUrl() {
        return url;
    }
    public String getMethod() {
        return method;
    }
    public Map<String,String> getHeaders() {
        return headers;
    }
    public Map<String,String> getQueryParams() {
        return queryParams;
    }
    public String getBody() {
        return body;
    }
    public int timeout() {
        return timeout;
    }
    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }
    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
        this.headers = builder.headers;
    }
    public static class Builder {
        private final String url;
        private String method = "GET";
        private Map<String,String> headers = new HashMap<>();
        private Map<String,String> queryParams = new HashMap<>();
        private String body;
        private int timeout = 30000;
        public Builder(String url) {
            this.url = url;
        }
        public Builder addMethod(String method) {
            this.method = method;
            return this;
        }
        public Builder addHeader(String key,String value) {
            this.headers.put(key,value);
            return this;
        }
        public Builder addQueryParams(String key,String value) {
            this.queryParams.put(key,value);
            return this;
        }
        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }
        public HttpRequest build() {
            return new HttpRequest(this);
        }

    }
}
