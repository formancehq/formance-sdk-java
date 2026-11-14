# State

Last recorded ingestion state; it can be stale. paused can represent requested suspension before ingestion exists. finished is successful bounded completion.

## Example Usage

```java
import com.formance.formance_sdk.models.connectivity.State;

State value = State.RUNNING;
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `RUNNING`  | running    |
| `ERROR`    | error      |
| `FAILED`   | failed     |
| `STOPPED`  | stopped    |
| `PAUSED`   | paused     |
| `FINISHED` | finished   |
| `UNKNOWN`  | unknown    |