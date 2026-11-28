# Lifecycle

Last recorded service outcome. completed means successful bounded completion. unknown means the recorded outcome is unrecognized, not healthy.

## Example Usage

```java
import com.formance.formance_sdk.models.connectivity.Lifecycle;

Lifecycle value = Lifecycle.PENDING;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `ACTIVE`    | active      |
| `SUSPENDED` | suspended   |
| `COMPLETED` | completed   |
| `FAILED`    | failed      |
| `UNKNOWN`   | unknown     |