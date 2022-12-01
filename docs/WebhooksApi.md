# WebhooksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateOneConfig**](WebhooksApi.md#activateOneConfig) | **PUT** api/webhooks/configs/{id}/activate | Activate one config |
| [**changeOneConfigSecret**](WebhooksApi.md#changeOneConfigSecret) | **PUT** api/webhooks/configs/{id}/secret/change | Change the signing secret of a config |
| [**deactivateOneConfig**](WebhooksApi.md#deactivateOneConfig) | **PUT** api/webhooks/configs/{id}/deactivate | Deactivate one config |
| [**deleteOneConfig**](WebhooksApi.md#deleteOneConfig) | **DELETE** api/webhooks/configs/{id} | Delete one config |
| [**getManyConfigs**](WebhooksApi.md#getManyConfigs) | **GET** api/webhooks/configs | Get many configs |
| [**insertOneConfig**](WebhooksApi.md#insertOneConfig) | **POST** api/webhooks/configs | Insert a new config  |
| [**testOneConfig**](WebhooksApi.md#testOneConfig) | **GET** api/webhooks/configs/{id}/test | Test one config |



## activateOneConfig

> ConfigActivatedResponse activateOneConfig(id)

Activate one config

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Config ID
        try {
            ConfigActivatedResponse result = apiInstance.activateOneConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#activateOneConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Config ID | |

### Return type

[**ConfigActivatedResponse**](ConfigActivatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Config successfully activated. |  -  |
| **304** | Config not modified, was already activated. |  -  |


## changeOneConfigSecret

> ConfigActivatedResponse changeOneConfigSecret(id, changeOneConfigSecretRequest)

Change the signing secret of a config

Change the signing secret of the endpoint of a config.  If not passed or empty, a secret is automatically generated. The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding) 

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Config ID
        ChangeOneConfigSecretRequest changeOneConfigSecretRequest = new ChangeOneConfigSecretRequest(); // ChangeOneConfigSecretRequest | 
        try {
            ConfigActivatedResponse result = apiInstance.changeOneConfigSecret(id, changeOneConfigSecretRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#changeOneConfigSecret");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Config ID | |
| **changeOneConfigSecretRequest** | [**ChangeOneConfigSecretRequest**](ChangeOneConfigSecretRequest.md)|  | [optional] |

### Return type

[**ConfigActivatedResponse**](ConfigActivatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret successfully changed. |  -  |


## deactivateOneConfig

> ConfigDeactivatedResponse deactivateOneConfig(id)

Deactivate one config

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Config ID
        try {
            ConfigDeactivatedResponse result = apiInstance.deactivateOneConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deactivateOneConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Config ID | |

### Return type

[**ConfigDeactivatedResponse**](ConfigDeactivatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Config successfully deactivated. |  -  |
| **304** | Config not modified, was already deactivated. |  -  |


## deleteOneConfig

> deleteOneConfig(id)

Delete one config

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Config ID
        try {
            apiInstance.deleteOneConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteOneConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Config ID | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Config successfully deleted. |  -  |


## getManyConfigs

> GetManyConfigs200Response getManyConfigs(id, endpoint)

Get many configs

Sorted by updated date descending

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Optional filter by Config ID
        String endpoint = "https://example.com"; // String | Optional filter by endpoint URL
        try {
            GetManyConfigs200Response result = apiInstance.getManyConfigs(id, endpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getManyConfigs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Optional filter by Config ID | [optional] |
| **endpoint** | **String**| Optional filter by endpoint URL | [optional] |

### Return type

[**GetManyConfigs200Response**](GetManyConfigs200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## insertOneConfig

> ConfigActivatedResponse insertOneConfig(configUser)

Insert a new config 

Insert a new config.  The endpoint should be a valid https URL and be unique.  The secret is the endpoint&#39;s verification secret. If not passed or empty, a secret is automatically generated. The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)  All eventTypes are converted to lower-case when inserted. 

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        ConfigUser configUser = new ConfigUser(); // ConfigUser | 
        try {
            ConfigActivatedResponse result = apiInstance.insertOneConfig(configUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#insertOneConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configUser** | [**ConfigUser**](ConfigUser.md)|  | |

### Return type

[**ConfigActivatedResponse**](ConfigActivatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Config created successfully. |  -  |
| **400** | Bad Request |  -  |


## testOneConfig

> AttemptResponse testOneConfig(id)

Test one config

Test one config by sending a webhook to its endpoint. 

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "4997257d-dfb6-445b-929c-cbe2ab182818"; // String | Config ID
        try {
            AttemptResponse result = apiInstance.testOneConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#testOneConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Config ID | |

### Return type

[**AttemptResponse**](AttemptResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

