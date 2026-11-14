# AddAccountTypeRequestPersistence

How account volumes are stored.
NORMAL: fully persisted (default).
EPHEMERAL: persisted, purged when zero balance after commit.
TRANSIENT: never persisted, must be zero at end of batch.


## Example Usage

```java
import com.formance.formance_sdk.models.ledgerv3.AddAccountTypeRequestPersistence;

AddAccountTypeRequestPersistence value = AddAccountTypeRequestPersistence.NORMAL;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `NORMAL`    | NORMAL      |
| `EPHEMERAL` | EPHEMERAL   |
| `TRANSIENT` | TRANSIENT   |