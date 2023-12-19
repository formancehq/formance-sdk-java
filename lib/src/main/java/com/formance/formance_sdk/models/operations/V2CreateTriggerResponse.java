/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2CreateTriggerResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2CreateTriggerResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2CreateTriggerResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2CreateTriggerResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created trigger
     */
    
    public com.formance.formance_sdk.models.shared.V2CreateTriggerResponse v2CreateTriggerResponse;

    public V2CreateTriggerResponse withV2CreateTriggerResponse(com.formance.formance_sdk.models.shared.V2CreateTriggerResponse v2CreateTriggerResponse) {
        this.v2CreateTriggerResponse = v2CreateTriggerResponse;
        return this;
    }
    
    /**
     * General error
     */
    
    public com.formance.formance_sdk.models.shared.V2Error v2Error;

    public V2CreateTriggerResponse withV2Error(com.formance.formance_sdk.models.shared.V2Error v2Error) {
        this.v2Error = v2Error;
        return this;
    }
    
    public V2CreateTriggerResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
