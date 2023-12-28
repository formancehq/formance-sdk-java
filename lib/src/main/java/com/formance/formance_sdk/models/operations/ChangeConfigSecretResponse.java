/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ChangeConfigSecretResponse {
    /**
     * Secret successfully changed.
     */
    
    public com.formance.formance_sdk.models.shared.ConfigResponse configResponse;

    public ChangeConfigSecretResponse withConfigResponse(com.formance.formance_sdk.models.shared.ConfigResponse configResponse) {
        this.configResponse = configResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ChangeConfigSecretResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ChangeConfigSecretResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ChangeConfigSecretResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse;

    public ChangeConfigSecretResponse withWebhooksErrorResponse(com.formance.formance_sdk.models.shared.WebhooksErrorResponse webhooksErrorResponse) {
        this.webhooksErrorResponse = webhooksErrorResponse;
        return this;
    }
    
    public ChangeConfigSecretResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
