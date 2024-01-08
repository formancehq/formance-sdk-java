/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetManyConfigsResponse {
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.ConfigsResponse configsResponse;

    public GetManyConfigsResponse withConfigsResponse(com.formance.formance_sdk.models.shared.ConfigsResponse configsResponse) {
        this.configsResponse = configsResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetManyConfigsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetManyConfigsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetManyConfigsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse;

    public GetManyConfigsResponse withWebhooksErrorResponse(com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse) {
        this.webhooksErrorResponse = webhooksErrorResponse;
        return this;
    }
    
    public GetManyConfigsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
