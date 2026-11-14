# ConnectionCreateChannel

Maturity channel the service resolves to an exact release. Exactly
one of `version` and `channel`. The last applied release is reported in `status.appliedVersion`.


## Example Usage

```java
import com.formance.formance_sdk.models.connectivity.ConnectionCreateChannel;

ConnectionCreateChannel value = ConnectionCreateChannel.STABLE;
```


## Values

| Name     | Value    |
| -------- | -------- |
| `STABLE` | stable   |
| `RC`     | rc       |
| `BETA`   | beta     |
| `ALPHA`  | alpha    |