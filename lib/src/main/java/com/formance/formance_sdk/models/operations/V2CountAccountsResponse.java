/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2CountAccountsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2CountAccountsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public V2CountAccountsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2CountAccountsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2CountAccountsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse;

    public V2CountAccountsResponse withV2ErrorResponse(com.formance.formance_sdk.models.shared.V2ErrorResponse v2ErrorResponse) {
        this.v2ErrorResponse = v2ErrorResponse;
        return this;
    }
    
    public V2CountAccountsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("Headers") java.util.Map<String, String[]> headers, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
