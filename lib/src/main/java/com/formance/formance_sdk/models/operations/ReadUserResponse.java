/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ReadUserResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ReadUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Retrieved user
     */
    
    public com.formance.formance_sdk.models.shared.ReadUserResponse readUserResponse;

    public ReadUserResponse withReadUserResponse(com.formance.formance_sdk.models.shared.ReadUserResponse readUserResponse) {
        this.readUserResponse = readUserResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ReadUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ReadUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ReadUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
