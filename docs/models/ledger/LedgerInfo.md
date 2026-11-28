# LedgerInfo

Runtime information about a ledger, including the state of its storage migrations


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `name`                                                                   | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | Name of the ledger                                                       | ledger001                                                                |
| `storage`                                                                | [Optional\<LedgerInfoStorage>](../../models/shared/LedgerInfoStorage.md) | :heavy_minus_sign:                                                       | Storage backend information, including the applied migrations            |                                                                          |