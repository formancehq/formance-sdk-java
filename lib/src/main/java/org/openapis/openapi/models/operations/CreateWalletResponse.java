/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateWalletResponse {
    
    public String contentType;

    public CreateWalletResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Wallet created
     */
    
    public org.openapis.openapi.models.shared.CreateWalletResponse createWalletResponse;

    public CreateWalletResponse withCreateWalletResponse(org.openapis.openapi.models.shared.CreateWalletResponse createWalletResponse) {
        this.createWalletResponse = createWalletResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateWalletResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateWalletResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Error
     */
    
    public org.openapis.openapi.models.shared.WalletsErrorResponse walletsErrorResponse;

    public CreateWalletResponse withWalletsErrorResponse(org.openapis.openapi.models.shared.WalletsErrorResponse walletsErrorResponse) {
        this.walletsErrorResponse = walletsErrorResponse;
        return this;
    }
    
    public CreateWalletResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
