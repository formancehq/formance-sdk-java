# ResolveAlertRequest

Mark an alert resolved. When `transactionRefs` is non-empty the
resolution kind is recorded as `fixed_by_booking`.



## Fields

| Field               | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `by`                | *String*            | :heavy_check_mark:  | N/A                 |
| `note`              | *Optional\<String>* | :heavy_minus_sign:  | N/A                 |
| `transactionRefs`   | List\<*String*>     | :heavy_minus_sign:  | N/A                 |