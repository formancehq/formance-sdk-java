# MetadataSchemaStatusResponseData


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `accountFields`                                                                 | Map\<String, [MetadataFieldStatus](../../models/shared/MetadataFieldStatus.md)> | :heavy_check_mark:                                                              | Account metadata field declarations                                             |
| `ledgerFields`                                                                  | Map\<String, [MetadataFieldStatus](../../models/shared/MetadataFieldStatus.md)> | :heavy_check_mark:                                                              | Ledger metadata field declarations                                              |
| `transactionFields`                                                             | Map\<String, [MetadataFieldStatus](../../models/shared/MetadataFieldStatus.md)> | :heavy_check_mark:                                                              | Transaction metadata field declarations                                         |