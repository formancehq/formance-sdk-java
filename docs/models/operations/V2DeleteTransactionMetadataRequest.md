# V2DeleteTransactionMetadataRequest


## Fields

| Field                  | Type                   | Required               | Description            | Example                |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `idempotencyKey`       | *Optional\<String>*    | :heavy_minus_sign:     | Use an idempotency key |                        |
| `id`                   | *BigInteger*           | :heavy_check_mark:     | Transaction ID.        | 1234                   |
| `key`                  | *String*               | :heavy_check_mark:     | The key to remove.     | foo                    |
| `ledger`               | *String*               | :heavy_check_mark:     | Name of the ledger.    | ledger001              |