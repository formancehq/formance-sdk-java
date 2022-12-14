# BalancesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalances**](BalancesApi.md#getBalances) | **GET** api/ledger/{ledger}/balances | Get the balances from a ledger&#39;s account |
| [**getBalancesAggregated**](BalancesApi.md#getBalancesAggregated) | **GET** api/ledger/{ledger}/aggregate/balances | Get the aggregated balances from selected accounts |



## getBalances

> GetBalances200Response getBalances(ledger, address, after, paginationToken)

Get the balances from a ledger&#39;s account

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        String ledger = "ledger001"; // String | Name of the ledger.
        String address = "users:001"; // String | Filter balances involving given account, either as source or destination.
        String after = "users:003"; // String | Pagination cursor, will return accounts after given address, in descending order.
        String paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ=="; // String | Parameter used in pagination requests.  Set to the value of next for the next page of results.  Set to the value of previous for the previous page of results.
        try {
            GetBalances200Response result = apiInstance.getBalances(ledger, address, after, paginationToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#getBalances");
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
| **ledger** | **String**| Name of the ledger. | |
| **address** | **String**| Filter balances involving given account, either as source or destination. | [optional] |
| **after** | **String**| Pagination cursor, will return accounts after given address, in descending order. | [optional] |
| **paginationToken** | **String**| Parameter used in pagination requests.  Set to the value of next for the next page of results.  Set to the value of previous for the previous page of results. | [optional] |

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## getBalancesAggregated

> GetBalancesAggregated200Response getBalancesAggregated(ledger, address)

Get the aggregated balances from selected accounts

### Example

```java
// Import classes:
import com.formance.formance.ApiClient;
import com.formance.formance.ApiException;
import com.formance.formance.Configuration;
import com.formance.formance.auth.*;
import com.formance.formance.models.*;
import com.formance.formance.api.BalancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        BalancesApi apiInstance = new BalancesApi(defaultClient);
        String ledger = "ledger001"; // String | Name of the ledger.
        String address = "users:001"; // String | Filter balances involving given account, either as source or destination.
        try {
            GetBalancesAggregated200Response result = apiInstance.getBalancesAggregated(ledger, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalancesApi#getBalancesAggregated");
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
| **ledger** | **String**| Name of the ledger. | |
| **address** | **String**| Filter balances involving given account, either as source or destination. | [optional] |

### Return type

[**GetBalancesAggregated200Response**](GetBalancesAggregated200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

