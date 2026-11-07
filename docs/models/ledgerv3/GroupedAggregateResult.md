# GroupedAggregateResult


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `prefix`                                                           | *String*                                                           | :heavy_check_mark:                                                 | Account prefix this group matches                                  |
| `volumes`                                                          | List\<[AggregatedVolume](../../models/shared/AggregatedVolume.md)> | :heavy_check_mark:                                                 | Aggregated volumes for accounts matching this prefix               |