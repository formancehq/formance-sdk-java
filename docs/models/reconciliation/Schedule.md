# Schedule


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `expr`                                              | *Optional\<String>*                                 | :heavy_minus_sign:                                  | N/A                                                 | */15 * * * *                                        |
| `kind`                                              | [ScheduleKind](../../models/shared/ScheduleKind.md) | :heavy_check_mark:                                  | N/A                                                 |                                                     |
| `safetyMargin`                                      | *Optional\<String>*                                 | :heavy_minus_sign:                                  | Go duration string                                  | 30s                                                 |
| `tz`                                                | *Optional\<String>*                                 | :heavy_minus_sign:                                  | N/A                                                 | UTC                                                 |