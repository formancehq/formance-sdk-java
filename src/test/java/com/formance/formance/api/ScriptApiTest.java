package com.formance.formance.api;

import com.formance.formance.ApiClient;
import com.formance.formance.model.Script;
import com.formance.formance.model.ScriptResult;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScriptApi
 */
public class ScriptApiTest {

    private ScriptApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScriptApi.class);
    }

    /**
     * Execute a Numscript.
     *
     * 
     */
    @Test
    public void runScriptTest() {
        String ledger = null;
        Script script = null;
        Boolean preview = null;
        // ScriptResult response = api.runScript(ledger, script, preview);

        // TODO: test validations
    }
}
