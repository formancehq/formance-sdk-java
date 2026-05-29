# V2LogDataRevertedTransaction

Payload for REVERTED_TRANSACTION log entries. Contains both the original reverted transaction and the new reverting transaction.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `v2LogTransaction`                                          | [V2LogTransaction](../../models/shared/V2LogTransaction.md) | :heavy_check_mark:                                          | Transaction structure as it appears in log payloads         |
| `v2LogTransaction1`                                         | [V2LogTransaction](../../models/shared/V2LogTransaction.md) | :heavy_check_mark:                                          | Transaction structure as it appears in log payloads         |