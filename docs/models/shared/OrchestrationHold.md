# OrchestrationHold


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `description`                                        | *String*                                             | :heavy_check_mark:                                   | N/A                                                  |
| `destination`                                        | [Optional\<Subject>](../../models/shared/Subject.md) | :heavy_minus_sign:                                   | N/A                                                  |
| `id`                                                 | *String*                                             | :heavy_check_mark:                                   | The unique ID of the hold.                           |
| `metadata`                                           | Map\<String, *String*>                               | :heavy_check_mark:                                   | Metadata associated with the hold.                   |
| `walletID`                                           | *String*                                             | :heavy_check_mark:                                   | The ID of the wallet the hold is associated with.    |