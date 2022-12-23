package com.formance.formance.api;

import com.formance.formance.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.formance.formance.model.CreateWalletRequest;
import com.formance.formance.model.CreateWalletResponse;
import com.formance.formance.model.CreditWalletRequest;
import com.formance.formance.model.DebitWalletRequest;
import com.formance.formance.model.DebitWalletResponse;
import com.formance.formance.model.GetHoldsResponse;
import com.formance.formance.model.GetWalletResponse;
import com.formance.formance.model.GetWalletsResponse;
import com.formance.formance.model.UpdateWalletRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface WalletsApi {
  /**
   * Confirm a hold
   * 
   * @param id  (required)
   * @param holdId  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("api/wallets/wallets/{id}/holds/{hold_id}/confirm")
  Call<Void> confirmHold(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("hold_id") String holdId
  );

  /**
   * Create a new wallet
   * 
   * @param createWalletRequest  (optional)
   * @return Call&lt;CreateWalletResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wallets/wallets")
  Call<CreateWalletResponse> createWallet(
    @retrofit2.http.Body CreateWalletRequest createWalletRequest
  );

  /**
   * Credit a wallet
   * 
   * @param id  (required)
   * @param creditWalletRequest  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wallets/wallets/{id}/credit")
  Call<Void> creditWallet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CreditWalletRequest creditWalletRequest
  );

  /**
   * Debit a wallet
   * 
   * @param id  (required)
   * @param debitWalletRequest  (optional)
   * @return Call&lt;DebitWalletResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wallets/wallets/{id}/debit")
  Call<DebitWalletResponse> debitWallet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body DebitWalletRequest debitWalletRequest
  );

  /**
   * Get all holds for a wallet
   * 
   * @param id  (required)
   * @return Call&lt;GetHoldsResponse&gt;
   */
  @GET("api/wallets/wallets/{id}/holds")
  Call<GetHoldsResponse> getHolds(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a wallet
   * 
   * @param id  (required)
   * @return Call&lt;GetWalletResponse&gt;
   */
  @GET("api/wallets/wallets/{id}")
  Call<GetWalletResponse> getWallet(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get all wallets
   * 
   * @param pageSize The maximum number of results to return per page (optional, default to 15)
   * @param after Pagination cursor, will return accounts after given address, in descending order. (optional)
   * @param paginationToken Parameter used in pagination requests. Maximum page size is set to 15. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when the pagination token is set.  (optional)
   * @return Call&lt;GetWalletsResponse&gt;
   */
  @GET("api/wallets/wallets")
  Call<GetWalletsResponse> getWallets(
    @retrofit2.http.Query("page_size") Integer pageSize, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("pagination_token") String paginationToken
  );

  /**
   * Update a wallet
   * 
   * @param id  (required)
   * @param updateWalletRequest  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wallets/wallets/{id}")
  Call<Void> updateWallet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body UpdateWalletRequest updateWalletRequest
  );

  /**
   * Cancel a hold
   * 
   * @param id  (required)
   * @param holdId  (required)
   * @return Call&lt;Void&gt;
   */
  @POST("api/wallets/wallets/{id}/holds/{hold_id}/void")
  Call<Void> voidHold(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("hold_id") String holdId
  );

}
