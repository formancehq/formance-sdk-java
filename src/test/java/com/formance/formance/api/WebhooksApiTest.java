package com.formance.formance.api;

import com.formance.formance.ApiClient;
import com.formance.formance.model.ChangeOneConfigSecretRequest;
import com.formance.formance.model.ConfigUser;
import com.formance.formance.model.GetManyConfigs200Response;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private WebhooksApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WebhooksApi.class);
    }

    /**
     * Activate one config
     *
     * 
     */
    @Test
    public void activateOneConfigTest() {
        String id = null;
        // GetManyConfigs200Response response = api.activateOneConfig(id);

        // TODO: test validations
    }
    /**
     * Change the signing secret of a config
     *
     * Change the signing secret of the endpoint of a config.  If not passed or empty, a secret is automatically generated.  The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding) 
     */
    @Test
    public void changeOneConfigSecretTest() {
        String id = null;
        ChangeOneConfigSecretRequest changeOneConfigSecretRequest = null;
        // GetManyConfigs200Response response = api.changeOneConfigSecret(id, changeOneConfigSecretRequest);

        // TODO: test validations
    }
    /**
     * Deactivate one config
     *
     * 
     */
    @Test
    public void deactivateOneConfigTest() {
        String id = null;
        // GetManyConfigs200Response response = api.deactivateOneConfig(id);

        // TODO: test validations
    }
    /**
     * Delete one config
     *
     * 
     */
    @Test
    public void deleteOneConfigTest() {
        String id = null;
        // api.deleteOneConfig(id);

        // TODO: test validations
    }
    /**
     * Get many configs
     *
     * Sorted by updated date descending
     */
    @Test
    public void getManyConfigsTest() {
        String id = null;
        String endpoint = null;
        // GetManyConfigs200Response response = api.getManyConfigs(id, endpoint);

        // TODO: test validations
    }
    /**
     * Insert a new config 
     *
     * Insert a new config.  The endpoint should be a valid https URL and be unique.  The secret is the endpoint&#39;s verification secret.  If not passed or empty, a secret is automatically generated.  The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)  All eventTypes are converted to lower-case when inserted. 
     */
    @Test
    public void insertOneConfigTest() {
        ConfigUser configUser = null;
        // String response = api.insertOneConfig(configUser);

        // TODO: test validations
    }
}
