# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmHold**](WalletsApi.md#confirmHold) | **POST** api/wallets/wallets/{id}/holds/{hold_id}/confirm | Confirm a hold |
| [**createWallet**](WalletsApi.md#createWallet) | **POST** api/wallets/wallets | Create a new wallet |
| [**creditWallet**](WalletsApi.md#creditWallet) | **POST** api/wallets/wallets/{id}/credit | Credit a wallet |
| [**debitWallet**](WalletsApi.md#debitWallet) | **POST** api/wallets/wallets/{id}/debit | Debit a wallet |
| [**getHolds**](WalletsApi.md#getHolds) | **GET** api/wallets/wallets/{id}/holds | Get all holds for a wallet |
| [**getWallet**](WalletsApi.md#getWallet) | **GET** api/wallets/wallets/{id} | Get a wallet |
| [**getWallets**](WalletsApi.md#getWallets) | **GET** api/wallets/wallets | Get all wallets |
| [**updateWallet**](WalletsApi.md#updateWallet) | **PATCH** api/wallets/wallets/{id} | Update a wallet |
| [**voidHold**](WalletsApi.md#voidHold) | **POST** api/wallets/wallets/{id}/holds/{hold_id}/void | Cancel a hold |



## confirmHold

> confirmHold(id, holdId)

Confirm a hold

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        String holdId = "holdId_example"; // String | 
        try {
            apiInstance.confirmHold(id, holdId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#confirmHold");
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
| **holdId** | **String**|  | |

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
| **204** | Hold successfully confirmed, funds moved back to initial destination |  -  |


## createWallet

> CreateWalletResponse createWallet(createWalletRequest)

Create a new wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        try {
            CreateWalletResponse result = apiInstance.createWallet(createWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#createWallet");
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
| **createWalletRequest** | [**CreateWalletRequest**](CreateWalletRequest.md)|  | [optional] |

### Return type

[**CreateWalletResponse**](CreateWalletResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Wallet created |  -  |


## creditWallet

> creditWallet(id, creditWalletRequest)

Credit a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        CreditWalletRequest creditWalletRequest = new CreditWalletRequest(); // CreditWalletRequest | 
        try {
            apiInstance.creditWallet(id, creditWalletRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#creditWallet");
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
| **creditWalletRequest** | [**CreditWalletRequest**](CreditWalletRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Wallet successfully credited |  -  |


## debitWallet

> DebitWalletResponse debitWallet(id, debitWalletRequest)

Debit a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        DebitWalletRequest debitWalletRequest = new DebitWalletRequest(); // DebitWalletRequest | 
        try {
            DebitWalletResponse result = apiInstance.debitWallet(id, debitWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#debitWallet");
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
| **debitWalletRequest** | [**DebitWalletRequest**](DebitWalletRequest.md)|  | [optional] |

### Return type

[**DebitWalletResponse**](DebitWalletResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wallet successfully debited as a pending hold |  -  |
| **204** | Wallet successfully debited |  -  |


## getHolds

> GetHoldsResponse getHolds(id)

Get all holds for a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            GetHoldsResponse result = apiInstance.getHolds(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#getHolds");
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

[**GetHoldsResponse**](GetHoldsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holds |  -  |


## getWallet

> GetWalletResponse getWallet(id)

Get a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            GetWalletResponse result = apiInstance.getWallet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#getWallet");
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

[**GetWalletResponse**](GetWalletResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Wallet |  -  |
| **404** | Wallet not found |  -  |


## getWallets

> GetWalletsResponse getWallets(pageSize, after, paginationToken)

Get all wallets

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        Integer pageSize = 15; // Integer | The maximum number of results to return per page
        String after = "users:003"; // String | Pagination cursor, will return accounts after given address, in descending order.
        String paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ=="; // String | Parameter used in pagination requests. Maximum page size is set to 15. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when the pagination token is set. 
        try {
            GetWalletsResponse result = apiInstance.getWallets(pageSize, after, paginationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#getWallets");
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
| **pageSize** | **Integer**| The maximum number of results to return per page | [optional] [default to 15] |
| **after** | **String**| Pagination cursor, will return accounts after given address, in descending order. | [optional] |
| **paginationToken** | **String**| Parameter used in pagination requests. Maximum page size is set to 15. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when the pagination token is set.  | [optional] |

### Return type

[**GetWalletsResponse**](GetWalletsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateWallet

> updateWallet(id, updateWalletRequest)

Update a wallet

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateWalletRequest updateWalletRequest = new UpdateWalletRequest(); // UpdateWalletRequest | 
        try {
            apiInstance.updateWallet(id, updateWalletRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#updateWallet");
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
| **updateWalletRequest** | [**UpdateWalletRequest**](UpdateWalletRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Wallet successfully updated |  -  |


## voidHold

> voidHold(id, holdId)

Cancel a hold

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.WalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        WalletsApi apiInstance = new WalletsApi(defaultClient);
        String id = "id_example"; // String | 
        String holdId = "holdId_example"; // String | 
        try {
            apiInstance.voidHold(id, holdId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletsApi#voidHold");
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
| **holdId** | **String**|  | |

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
| **204** | Hold successfully cancelled, funds returned to wallet |  -  |

