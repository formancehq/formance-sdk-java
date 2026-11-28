# Schedule

When a rule runs, either on demand or on a cron expression


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `expr`                                                                    | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Cron expression driving the schedule, required when kind is cron          | */15 * * * *                                                              |
| `kind`                                                                    | [ScheduleKind](../../models/shared/ScheduleKind.md)                       | :heavy_check_mark:                                                        | Whether the rule runs only when triggered or on a recurring cron schedule |                                                                           |
| `safetyMargin`                                                            | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Go duration string                                                        | 30s                                                                       |
| `tz`                                                                      | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Timezone the cron expression is interpreted in                            | UTC                                                                       |