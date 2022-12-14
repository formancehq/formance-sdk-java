package com.formance.formance.api;

import com.formance.formance.ApiClient;
import com.formance.formance.model.ConnectorConfig;
import com.formance.formance.model.ConnectorTask;
import com.formance.formance.model.ListConnectorsConfigsResponse;
import com.formance.formance.model.ListConnectorsResponse;
import com.formance.formance.model.ListPaymentsResponse;
import com.formance.formance.model.Payment;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
public class PaymentsApiTest {

    private PaymentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsApi.class);
    }

    /**
     * Get all installed connectors
     *
     * Get all installed connectors
     */
    @Test
    public void getAllConnectorsTest() {
        // ListConnectorsResponse response = api.getAllConnectors();

        // TODO: test validations
    }
    /**
     * Get all available connectors configs
     *
     * Get all available connectors configs
     */
    @Test
    public void getAllConnectorsConfigsTest() {
        // ListConnectorsConfigsResponse response = api.getAllConnectorsConfigs();

        // TODO: test validations
    }
    /**
     * Read a specific task of the connector
     *
     * Get a specific task associated to the connector
     */
    @Test
    public void getConnectorTaskTest() {
        String connector = null;
        String taskId = null;
        // ConnectorTask response = api.getConnectorTask(connector, taskId);

        // TODO: test validations
    }
    /**
     * Returns a payment.
     *
     * 
     */
    @Test
    public void getPaymentTest() {
        String paymentId = null;
        // Payment response = api.getPayment(paymentId);

        // TODO: test validations
    }
    /**
     * Install connector
     *
     * Install connector
     */
    @Test
    public void installConnectorTest() {
        String connector = null;
        ConnectorConfig connectorConfig = null;
        // api.installConnector(connector, connectorConfig);

        // TODO: test validations
    }
    /**
     * List connector tasks
     *
     * List all tasks associated with this connector.
     */
    @Test
    public void listConnectorTasksTest() {
        String connector = null;
        // List<ConnectorTask> response = api.listConnectorTasks(connector);

        // TODO: test validations
    }
    /**
     * Returns a list of payments.
     *
     * 
     */
    @Test
    public void listPaymentsTest() {
        Integer limit = null;
        Integer skip = null;
        List<String> sort = null;
        // ListPaymentsResponse response = api.listPayments(limit, skip, sort);

        // TODO: test validations
    }
    /**
     * Read connector config
     *
     * Read connector config
     */
    @Test
    public void readConnectorConfigTest() {
        String connector = null;
        // ConnectorConfig response = api.readConnectorConfig(connector);

        // TODO: test validations
    }
    /**
     * Reset connector
     *
     * Reset connector. Will remove the connector and ALL PAYMENTS generated with it.
     */
    @Test
    public void resetConnectorTest() {
        String connector = null;
        // api.resetConnector(connector);

        // TODO: test validations
    }
    /**
     * Uninstall connector
     *
     * Uninstall  connector
     */
    @Test
    public void uninstallConnectorTest() {
        String connector = null;
        // api.uninstallConnector(connector);

        // TODO: test validations
    }
}
