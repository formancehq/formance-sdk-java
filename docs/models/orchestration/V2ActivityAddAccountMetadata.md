# V2ActivityAddAccountMetadata

Arguments for the activity that sets metadata on a ledger account


## Fields

| Field                                   | Type                                    | Required                                | Description                             |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `id`                                    | *String*                                | :heavy_check_mark:                      | Address of the ledger account to update |
| `ledger`                                | *String*                                | :heavy_check_mark:                      | Name of the ledger holding the account  |
| `metadata`                              | Map\<String, *String*>                  | :heavy_check_mark:                      | Metadata to set on the account          |