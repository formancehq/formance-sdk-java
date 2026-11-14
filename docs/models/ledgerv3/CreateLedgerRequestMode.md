# CreateLedgerRequestMode

Ledger mode. MIRROR creates a read-only ledger that syncs from an external v2 source. Values are case-sensitive; any other value is rejected with 400 INVALID_REQUEST.

## Example Usage

```java
import com.formance.formance_sdk.models.ledgerv3.CreateLedgerRequestMode;

CreateLedgerRequestMode value = CreateLedgerRequestMode.NORMAL;
```


## Values

| Name     | Value    |
| -------- | -------- |
| `NORMAL` | NORMAL   |
| `MIRROR` | MIRROR   |