# V3OrderStatusEnum

Lifecycle of an order on the exchange.
`PENDING` — accepted by the exchange, not yet working.
`OPEN` — live on the book, no fills yet.
`PARTIALLY_FILLED` — live on the book, some base quantity filled.
`FILLED` — fully filled, terminal.
`CANCELLED` — cancelled by the user or system, terminal.
`FAILED` — rejected by the exchange, terminal. See `error` for details.
`EXPIRED` — `timeInForce` elapsed before full fill, terminal.


## Example Usage

```java
import com.formance.formance_sdk.models.payments.V3OrderStatusEnum;

V3OrderStatusEnum value = V3OrderStatusEnum.UNKNOWN;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `UNKNOWN`          | UNKNOWN            |
| `PENDING`          | PENDING            |
| `OPEN`             | OPEN               |
| `PARTIALLY_FILLED` | PARTIALLY_FILLED   |
| `FILLED`           | FILLED             |
| `CANCELLED`        | CANCELLED          |
| `FAILED`           | FAILED             |
| `EXPIRED`          | EXPIRED            |