/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2ReadTriggerResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2ReadTriggerResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2ReadTriggerResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2ReadTriggerResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * General error
     */
    
    public com.formance.formance_sdk.models.shared.V2Error v2Error;

    public V2ReadTriggerResponse withV2Error(com.formance.formance_sdk.models.shared.V2Error v2Error) {
        this.v2Error = v2Error;
        return this;
    }
    
    /**
     * A specific trigger
     */
    
    public com.formance.formance_sdk.models.shared.V2ReadTriggerResponse v2ReadTriggerResponse;

    public V2ReadTriggerResponse withV2ReadTriggerResponse(com.formance.formance_sdk.models.shared.V2ReadTriggerResponse v2ReadTriggerResponse) {
        this.v2ReadTriggerResponse = v2ReadTriggerResponse;
        return this;
    }
    
    public V2ReadTriggerResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
