# Outcome

How the attempt ended. A retryable failure is retried, a permanent failure is not

## Example Usage

```java
import com.formance.formance_sdk.models.webhooks.Outcome;

Outcome value = Outcome.SUCCEEDED;
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `SUCCEEDED`         | succeeded           |
| `RETRYABLE_FAILURE` | retryable_failure   |
| `PERMANENT_FAILURE` | permanent_failure   |