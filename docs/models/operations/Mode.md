# Mode

Inspection mode. The deprecated distinct-values alias for distinctValues remains accepted. An explicitly empty or unsupported value returns 400.

## Example Usage

```java
import com.formance.formance_sdk.models.operations.Mode;

Mode value = Mode.SUMMARY;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `SUMMARY`         | summary           |
| `DISTINCT_VALUES` | distinctValues    |
| `FACETS`          | facets            |