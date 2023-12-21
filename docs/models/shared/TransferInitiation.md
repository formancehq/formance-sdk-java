# TransferInitiation


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `amount`                                                                                  | *Long*                                                                                    | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `asset`                                                                                   | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       | USD                                                                                       |
| `connectorID`                                                                             | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `createdAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `description`                                                                             | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `destinationAccountID`                                                                    | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `error`                                                                                   | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       | XXX                                                                                       |
| `metadata`                                                                                | Map<String, *String*>                                                                     | :heavy_minus_sign:                                                                        | N/A                                                                                       |                                                                                           |
| `reference`                                                                               | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `relatedPayments`                                                                         | List<[TransferInitiationPayments](../../models/shared/TransferInitiationPayments.md)>     | :heavy_minus_sign:                                                                        | N/A                                                                                       |                                                                                           |
| `scheduledAt`                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `sourceAccountID`                                                                         | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `status`                                                                                  | [TransferInitiationStatus](../../models/shared/TransferInitiationStatus.md)               | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `type`                                                                                    | [TransferInitiationType](../../models/shared/TransferInitiationType.md)                   | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `updatedAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |