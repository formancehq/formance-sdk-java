# AggregateVolumesData


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `groups`                                                                       | List\<[GroupedAggregateResult](../../models/shared/GroupedAggregateResult.md)> | :heavy_minus_sign:                                                             | Per-prefix aggregated volumes (present when groupByPrefixes is set)            |
| `volumes`                                                                      | List\<[AggregatedVolume](../../models/shared/AggregatedVolume.md)>             | :heavy_check_mark:                                                             | Flat aggregated volumes per asset                                              |