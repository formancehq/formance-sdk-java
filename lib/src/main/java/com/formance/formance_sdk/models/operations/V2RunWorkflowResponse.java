/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class V2RunWorkflowResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public V2RunWorkflowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public V2RunWorkflowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public V2RunWorkflowResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * General error
     */
    
    public com.formance.formance_sdk.models.shared.V2Error v2Error;

    public V2RunWorkflowResponse withV2Error(com.formance.formance_sdk.models.shared.V2Error v2Error) {
        this.v2Error = v2Error;
        return this;
    }
    
    /**
     * The workflow instance
     */
    
    public com.formance.formance_sdk.models.shared.V2RunWorkflowResponse v2RunWorkflowResponse;

    public V2RunWorkflowResponse withV2RunWorkflowResponse(com.formance.formance_sdk.models.shared.V2RunWorkflowResponse v2RunWorkflowResponse) {
        this.v2RunWorkflowResponse = v2RunWorkflowResponse;
        return this;
    }
    
    public V2RunWorkflowResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
