package org.mir.saleem;

import java.util.Map;

public class LambdaResponse {
    public LambdaResponse(boolean isBase64Encoded, int statusCode, String body, Map<String, String> headers, Map<String, String[]> multiValueHeaders) {
        this.isBase64Encoded = isBase64Encoded;
        this.statusCode = statusCode;
        this.body = body;
        this.headers = headers;
        this.multiValueHeaders = multiValueHeaders;
    }

    private boolean isBase64Encoded;

    @Override
    public String toString() {
        return "LambdaResponse{" +
                "isBase64Encoded=" + isBase64Encoded +
                ", statusCode=" + statusCode +
                ", body='" + body + '\'' +
                ", headers=" + headers +
                ", multiValueHeaders=" + multiValueHeaders +
                '}';
    }

    private int statusCode;
   private String body;
   private Map<String, String> headers;
   private Map<String, String[]> multiValueHeaders;

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String[]> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    public void setMultiValueHeaders(Map<String, String[]> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }
}
