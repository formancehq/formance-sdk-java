# V2DeleteAccountMetadataRequest


## Fields

| Field                  | Type                   | Required               | Description            | Example                |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `idempotencyKey`       | *Optional\<String>*    | :heavy_minus_sign:     | Use an idempotency key |                        |
| `address`              | *String*               | :heavy_check_mark:     | Account address        |                        |
| `key`                  | *String*               | :heavy_check_mark:     | The key to remove.     | foo                    |
| `ledger`               | *String*               | :heavy_check_mark:     | Name of the ledger.    | ledger001              |