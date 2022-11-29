package com.formance.formance.api;

import com.formance.formance.ApiClient;
import com.formance.formance.model.Query;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }

    /**
     * Search
     *
     * Search with Query
     */
    @Test
    public void searchTest() {
        Query query = null;
        // api.search(query);

        // TODO: test validations
    }
}
