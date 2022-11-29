package com.formance.formance.api;

import com.formance.formance.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.formance.formance.model.GetBalances200Response;
import com.formance.formance.model.GetBalancesAggregated200Response;
import com.formance.formance.model.GetBalancesAggregated400Response;
import com.formance.formance.model.ListAccounts400Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BalancesApi {
  /**
   * Get the balances from a ledger&#39;s account
   * 
   * @param ledger Name of the ledger. (required)
   * @param address Filter balances involving given account, either as source or destination. (optional)
   * @param after Pagination cursor, will return accounts after given address, in descending order. (optional)
   * @param paginationToken Parameter used in pagination requests.  Set to the value of next for the next page of results.  Set to the value of previous for the previous page of results. (optional)
   * @return Call&lt;GetBalances200Response&gt;
   */
  @GET("api/ledger/{ledger}/balances")
  Call<GetBalances200Response> getBalances(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Query("address") String address, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("pagination_token") String paginationToken
  );

  /**
   * Get the aggregated balances from selected accounts
   * 
   * @param ledger Name of the ledger. (required)
   * @param address Filter balances involving given account, either as source or destination. (optional)
   * @return Call&lt;GetBalancesAggregated200Response&gt;
   */
  @GET("api/ledger/{ledger}/aggregate/balances")
  Call<GetBalancesAggregated200Response> getBalancesAggregated(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Query("address") String address
  );

}
