# InspectSummaryResponse


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `cardinality`                                                 | *long*                                                        | :heavy_check_mark:                                            | Number of distinct values                                     |
| `entitiesWithKey`                                             | *long*                                                        | :heavy_check_mark:                                            | Number of entities that have this metadata key set (non-null) |
| `entitiesWithNull`                                            | *long*                                                        | :heavy_check_mark:                                            | Number of entities with a null value for this key             |
| `max`                                                         | *Optional\<Object>*                                           | :heavy_minus_sign:                                            | Maximum value (null if index is empty)                        |
| `min`                                                         | *Optional\<Object>*                                           | :heavy_minus_sign:                                            | Minimum value (null if index is empty)                        |