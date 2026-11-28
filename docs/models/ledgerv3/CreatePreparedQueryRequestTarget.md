# CreatePreparedQueryRequestTarget

Target entity type. `LOGS` queries return log entries; the log-only filter fields (`logId`, `date`, `ledger`) are valid only when the target is `LOGS`.

## Example Usage

```java
import com.formance.formance_sdk.models.ledgerv3.CreatePreparedQueryRequestTarget;

CreatePreparedQueryRequestTarget value = CreatePreparedQueryRequestTarget.ACCOUNTS;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `ACCOUNTS`     | ACCOUNTS       |
| `TRANSACTIONS` | TRANSACTIONS   |
| `LOGS`         | LOGS           |