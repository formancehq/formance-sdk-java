# V2LedgerInfo

Runtime information about a ledger, including the state of its storage migrations


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `name`                                                                               | *Optional\<String>*                                                                  | :heavy_minus_sign:                                                                   | Name of the ledger                                                                   | ledger001                                                                            |
| `storage`                                                                            | [Optional\<V2LedgerInfoStorage>](../../models/shared/V2LedgerInfoStorage.md)         | :heavy_minus_sign:                                                                   | Storage backend information, including the migrations applied to the ledger's bucket |                                                                                      |