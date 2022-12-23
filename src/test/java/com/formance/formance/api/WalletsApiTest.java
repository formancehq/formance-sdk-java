package com.formance.formance.api;

import com.formance.formance.ApiClient;
import com.formance.formance.model.CreateWalletRequest;
import com.formance.formance.model.CreateWalletResponse;
import com.formance.formance.model.CreditWalletRequest;
import com.formance.formance.model.DebitWalletRequest;
import com.formance.formance.model.DebitWalletResponse;
import com.formance.formance.model.GetHoldsResponse;
import com.formance.formance.model.GetWalletResponse;
import com.formance.formance.model.GetWalletsResponse;
import com.formance.formance.model.UpdateWalletRequest;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
public class WalletsApiTest {

    private WalletsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WalletsApi.class);
    }

    /**
     * Confirm a hold
     *
     * 
     */
    @Test
    public void confirmHoldTest() {
        String id = null;
        String holdId = null;
        // api.confirmHold(id, holdId);

        // TODO: test validations
    }
    /**
     * Create a new wallet
     *
     * 
     */
    @Test
    public void createWalletTest() {
        CreateWalletRequest createWalletRequest = null;
        // CreateWalletResponse response = api.createWallet(createWalletRequest);

        // TODO: test validations
    }
    /**
     * Credit a wallet
     *
     * 
     */
    @Test
    public void creditWalletTest() {
        String id = null;
        CreditWalletRequest creditWalletRequest = null;
        // api.creditWallet(id, creditWalletRequest);

        // TODO: test validations
    }
    /**
     * Debit a wallet
     *
     * 
     */
    @Test
    public void debitWalletTest() {
        String id = null;
        DebitWalletRequest debitWalletRequest = null;
        // DebitWalletResponse response = api.debitWallet(id, debitWalletRequest);

        // TODO: test validations
    }
    /**
     * Get all holds for a wallet
     *
     * 
     */
    @Test
    public void getHoldsTest() {
        String id = null;
        // GetHoldsResponse response = api.getHolds(id);

        // TODO: test validations
    }
    /**
     * Get a wallet
     *
     * 
     */
    @Test
    public void getWalletTest() {
        String id = null;
        // GetWalletResponse response = api.getWallet(id);

        // TODO: test validations
    }
    /**
     * Get all wallets
     *
     * 
     */
    @Test
    public void getWalletsTest() {
        Integer pageSize = null;
        String after = null;
        String paginationToken = null;
        // GetWalletsResponse response = api.getWallets(pageSize, after, paginationToken);

        // TODO: test validations
    }
    /**
     * Update a wallet
     *
     * 
     */
    @Test
    public void updateWalletTest() {
        String id = null;
        UpdateWalletRequest updateWalletRequest = null;
        // api.updateWallet(id, updateWalletRequest);

        // TODO: test validations
    }
    /**
     * Cancel a hold
     *
     * 
     */
    @Test
    public void voidHoldTest() {
        String id = null;
        String holdId = null;
        // api.voidHold(id, holdId);

        // TODO: test validations
    }
}
