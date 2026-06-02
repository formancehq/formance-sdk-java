# V2LogDataRevertedTransaction

Payload for REVERTED_TRANSACTION log entries. Contains both the original reverted transaction and the new reverting transaction.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `revertedTransaction`                                       | [V2LogTransaction](../../models/shared/V2LogTransaction.md) | :heavy_check_mark:                                          | Transaction structure as it appears in log payloads         |
| `transaction`                                               | [V2LogTransaction](../../models/shared/V2LogTransaction.md) | :heavy_check_mark:                                          | Transaction structure as it appears in log payloads         |