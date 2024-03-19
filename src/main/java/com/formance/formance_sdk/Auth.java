/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.SDKMethodInterfaces.*;
import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.HTTPRequest;
import com.formance.formance_sdk.utils.JSON;
import com.formance.formance_sdk.utils.SerializedBody;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Auth implements
            MethodCallCreateClient,
            MethodCallCreateSecret,
            MethodCallDeleteClient,
            MethodCallDeleteSecret,
            MethodCallListClients,
            MethodCallListUsers,
            MethodCallReadClient,
            MethodCallReadUser,
            MethodCallUpdateClient {

    private final SDKConfiguration sdkConfiguration;

    Auth(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public com.formance.formance_sdk.models.operations.CreateClientRequestBuilder createClient() {
        return new com.formance.formance_sdk.models.operations.CreateClientRequestBuilder(this);
    }

    /**
     * Create client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.CreateClientResponse createClient(
            Optional<? extends com.formance.formance_sdk.models.shared.CreateClientRequest> request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                baseUrl,
                "/api/auth/clients");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<Optional<? extends com.formance.formance_sdk.models.shared.CreateClientRequest>>() {});
        SerializedBody serializedRequestBody = com.formance.formance_sdk.utils.Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.CreateClientResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.CreateClientResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.CreateClientResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 201) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.CreateClientResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.CreateClientResponse>() {});
                res.withCreateClientResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.CreateSecretRequestBuilder createSecret() {
        return new com.formance.formance_sdk.models.operations.CreateSecretRequestBuilder(this);
    }

    /**
     * Add a secret to a client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.CreateSecretResponse createSecret(
            com.formance.formance_sdk.models.operations.CreateSecretRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.CreateSecretRequest.class,
                baseUrl,
                "/api/auth/clients/{clientId}/secrets",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.formance.formance_sdk.models.operations.CreateSecretRequest>() {});
        SerializedBody serializedRequestBody = com.formance.formance_sdk.utils.Utils.serializeRequestBody(
                _convertedRequest, "createSecretRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.CreateSecretResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.CreateSecretResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.CreateSecretResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.CreateSecretResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.CreateSecretResponse>() {});
                res.withCreateSecretResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.DeleteClientRequestBuilder deleteClient() {
        return new com.formance.formance_sdk.models.operations.DeleteClientRequestBuilder(this);
    }

    /**
     * Delete client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.DeleteClientResponse deleteClient(
            com.formance.formance_sdk.models.operations.DeleteClientRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.DeleteClientRequest.class,
                baseUrl,
                "/api/auth/clients/{clientId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.DeleteClientResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.DeleteClientResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.DeleteClientResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 204) {
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.DeleteSecretRequestBuilder deleteSecret() {
        return new com.formance.formance_sdk.models.operations.DeleteSecretRequestBuilder(this);
    }

    /**
     * Delete a secret from a client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.DeleteSecretResponse deleteSecret(
            com.formance.formance_sdk.models.operations.DeleteSecretRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.DeleteSecretRequest.class,
                baseUrl,
                "/api/auth/clients/{clientId}/secrets/{secretId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.DeleteSecretResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.DeleteSecretResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.DeleteSecretResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 204) {
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.ListClientsRequestBuilder listClients() {
        return new com.formance.formance_sdk.models.operations.ListClientsRequestBuilder(this);
    }

    /**
     * List clients
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.ListClientsResponse listClientsDirect() throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                baseUrl,
                "/api/auth/clients");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.ListClientsResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.ListClientsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.ListClientsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.ListClientsResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.ListClientsResponse>() {});
                res.withListClientsResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.ListUsersRequestBuilder listUsers() {
        return new com.formance.formance_sdk.models.operations.ListUsersRequestBuilder(this);
    }

    /**
     * List users
     * List users
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.ListUsersResponse listUsersDirect() throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                baseUrl,
                "/api/auth/users");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.ListUsersResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.ListUsersResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.ListUsersResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.ListUsersResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.ListUsersResponse>() {});
                res.withListUsersResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.ReadClientRequestBuilder readClient() {
        return new com.formance.formance_sdk.models.operations.ReadClientRequestBuilder(this);
    }

    /**
     * Read client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.ReadClientResponse readClient(
            com.formance.formance_sdk.models.operations.ReadClientRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.ReadClientRequest.class,
                baseUrl,
                "/api/auth/clients/{clientId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.ReadClientResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.ReadClientResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.ReadClientResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.ReadClientResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.ReadClientResponse>() {});
                res.withReadClientResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.ReadUserRequestBuilder readUser() {
        return new com.formance.formance_sdk.models.operations.ReadUserRequestBuilder(this);
    }

    /**
     * Read user
     * Read user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.ReadUserResponse readUser(
            com.formance.formance_sdk.models.operations.ReadUserRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.ReadUserRequest.class,
                baseUrl,
                "/api/auth/users/{userId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.ReadUserResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.ReadUserResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.ReadUserResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.ReadUserResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.ReadUserResponse>() {});
                res.withReadUserResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }


    public com.formance.formance_sdk.models.operations.UpdateClientRequestBuilder updateClient() {
        return new com.formance.formance_sdk.models.operations.UpdateClientRequestBuilder(this);
    }

    /**
     * Update client
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.formance.formance_sdk.models.operations.UpdateClientResponse updateClient(
            com.formance.formance_sdk.models.operations.UpdateClientRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.formance.formance_sdk.utils.Utils.generateURL(
                com.formance.formance_sdk.models.operations.UpdateClientRequest.class,
                baseUrl,
                "/api/auth/clients/{clientId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.formance.formance_sdk.models.operations.UpdateClientRequest>() {});
        SerializedBody serializedRequestBody = com.formance.formance_sdk.utils.Utils.serializeRequestBody(
                _convertedRequest, "updateClientRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.formance.formance_sdk.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.formance.formance_sdk.models.operations.UpdateClientResponse.Builder resBuilder = 
            com.formance.formance_sdk.models.operations.UpdateClientResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.formance.formance_sdk.models.operations.UpdateClientResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.formance.formance_sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.formance.formance_sdk.models.shared.UpdateClientResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.formance.formance_sdk.models.shared.UpdateClientResponse>() {});
                res.withUpdateClientResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500) || (httpRes.statusCode() >= 500 && httpRes.statusCode() < 600)) {
            throw new SDKError(httpRes, httpRes.statusCode(), "API error occurred", Utils.toByteArrayAndClose(httpRes.body()));
        }

        return res;
    }

}