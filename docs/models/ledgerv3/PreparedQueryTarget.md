# PreparedQueryTarget

Target entity type. `LOGS`, `ACCOUNTS` and `TRANSACTIONS` are all usable prepared-query targets (create, list/get and execute).

## Example Usage

```java
import com.formance.formance_sdk.models.ledgerv3.PreparedQueryTarget;

PreparedQueryTarget value = PreparedQueryTarget.ACCOUNTS;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `ACCOUNTS`     | ACCOUNTS       |
| `TRANSACTIONS` | TRANSACTIONS   |
| `LOGS`         | LOGS           |