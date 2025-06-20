/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.SDKMethodInterfaces.*;
import com.formance.formance_sdk.models.operations.SearchRequestBuilder;
import com.formance.formance_sdk.models.operations.SearchResponse;
import com.formance.formance_sdk.models.operations.SearchgetServerInfoRequestBuilder;
import com.formance.formance_sdk.models.operations.SearchgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Query;
import com.formance.formance_sdk.models.shared.Response;
import com.formance.formance_sdk.models.shared.ServerInfo;
import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.HTTPRequest;
import com.formance.formance_sdk.utils.Hook.AfterErrorContextImpl;
import com.formance.formance_sdk.utils.Hook.AfterSuccessContextImpl;
import com.formance.formance_sdk.utils.Hook.BeforeRequestContextImpl;
import com.formance.formance_sdk.utils.SerializedBody;
import com.formance.formance_sdk.utils.Utils.JsonShape;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class SearchV1 implements
            MethodCallSearch,
            MethodCallSearchgetServerInfo {

    private final SDKConfiguration sdkConfiguration;

    SearchV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * search.v1
     * 
     * <p>Elasticsearch.v1 query engine
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(this);
    }

    /**
     * search.v1
     * 
     * <p>Elasticsearch.v1 query engine
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SearchResponse search(
            Query request) throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/api/search/");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Query>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "request",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      _baseUrl,
                      "search", 
                      Optional.of(List.of("auth:read", "search:write")), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "search",
                            Optional.of(List.of("auth:read", "search:write")),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "search",
                            Optional.of(List.of("auth:read", "search:write")), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "search",
                            Optional.of(List.of("auth:read", "search:write")),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        SearchResponse.Builder _resBuilder = 
            SearchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        SearchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Response _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Response>() {});
                _res.withResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }


    /**
     * Get server info
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SearchgetServerInfoRequestBuilder searchgetServerInfo() {
        return new SearchgetServerInfoRequestBuilder(this);
    }

    /**
     * Get server info
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SearchgetServerInfoResponse searchgetServerInfoDirect() throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl(), this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/api/search/_info");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      _baseUrl,
                      "searchgetServerInfo", 
                      Optional.of(List.of("auth:read", "search:read")), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "searchgetServerInfo",
                            Optional.of(List.of("auth:read", "search:read")),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "searchgetServerInfo",
                            Optional.of(List.of("auth:read", "search:read")), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            _baseUrl,
                            "searchgetServerInfo",
                            Optional.of(List.of("auth:read", "search:read")),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        SearchgetServerInfoResponse.Builder _resBuilder = 
            SearchgetServerInfoResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        SearchgetServerInfoResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ServerInfo _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ServerInfo>() {});
                _res.withServerInfo(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
