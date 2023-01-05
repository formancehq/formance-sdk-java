# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBalance**](DefaultApi.md#createBalance) | **POST** api/wallets/wallets/{id}/balances | Create a balance |
| [**getBalance**](DefaultApi.md#getBalance) | **GET** api/wallets/wallets/{id}/balances/{balanceName} | Get detailed balance |
| [**getServerInfo**](DefaultApi.md#getServerInfo) | **GET** api/auth/_info | Get server info |
| [**listBalances**](DefaultApi.md#listBalances) | **GET** api/wallets/wallets/{id}/balances | List balances of a wallet |
| [**searchgetServerInfo**](DefaultApi.md#searchgetServerInfo) | **GET** api/search/_info | Get server info |
| [**walletsgetServerInfo**](DefaultApi.md#walletsgetServerInfo) | **GET** api/wallets/_info | Get server info |



## createBalance

> CreateBalanceResponse createBalance(id, body)

Create a balance

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        Balance body = new Balance(); // Balance | 
        try {
            CreateBalanceResponse result = apiInstance.createBalance(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createBalance");
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
| **id** | **String**|  | |
| **body** | **Balance**|  | [optional] |

### Return type

[**CreateBalanceResponse**](CreateBalanceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created balance |  -  |


## getBalance

> GetBalanceResponse getBalance(id, balanceName)

Get detailed balance

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String balanceName = "balanceName_example"; // String | 
        try {
            GetBalanceResponse result = apiInstance.getBalance(id, balanceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getBalance");
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
| **id** | **String**|  | |
| **balanceName** | **String**|  | |

### Return type

[**GetBalanceResponse**](GetBalanceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Balance summary |  -  |


## getServerInfo

> ServerInfo getServerInfo()

Get server info

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ServerInfo result = apiInstance.getServerInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getServerInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServerInfo**](ServerInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server information |  -  |


## listBalances

> ListBalancesResponse listBalances(id)

List balances of a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ListBalancesResponse result = apiInstance.listBalances(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listBalances");
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
| **id** | **String**|  | |

### Return type

[**ListBalancesResponse**](ListBalancesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Balances list |  -  |


## searchgetServerInfo

> ServerInfo searchgetServerInfo()

Get server info

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ServerInfo result = apiInstance.searchgetServerInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#searchgetServerInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServerInfo**](ServerInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server information |  -  |


## walletsgetServerInfo

> ServerInfo walletsgetServerInfo()

Get server info

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ServerInfo result = apiInstance.walletsgetServerInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#walletsgetServerInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServerInfo**](ServerInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server information |  -  |

