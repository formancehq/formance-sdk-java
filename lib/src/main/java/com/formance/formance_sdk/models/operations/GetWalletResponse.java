/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetWalletResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Wallet
     */
    
    public com.formance.formance_sdk.models.shared.GetWalletResponse getWalletResponse;

    public GetWalletResponse withGetWalletResponse(com.formance.formance_sdk.models.shared.GetWalletResponse getWalletResponse) {
        this.getWalletResponse = getWalletResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetWalletResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetWalletResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse;

    public GetWalletResponse withWalletsErrorResponse(com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
    public GetWalletResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
