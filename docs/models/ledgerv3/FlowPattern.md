# FlowPattern


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `metadataKeys`                                                       | List\<*String*>                                                      | :heavy_minus_sign:                                                   | N/A                                                                  |
| `postings`                                                           | List\<[NormalizedPosting](../../models/shared/NormalizedPosting.md)> | :heavy_minus_sign:                                                   | N/A                                                                  |
| `signature`                                                          | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | Canonical flow signature (e.g. "users:{id}:main->bank:fees[USD]")    |
| `structure`                                                          | [Optional\<Structure>](../../models/shared/Structure.md)             | :heavy_minus_sign:                                                   | N/A                                                                  |
| `temporal`                                                           | [Optional\<TemporalStats>](../../models/shared/TemporalStats.md)     | :heavy_minus_sign:                                                   | N/A                                                                  |
| `transactionCount`                                                   | *Optional\<Long>*                                                    | :heavy_minus_sign:                                                   | N/A                                                                  |
| `volumeStats`                                                        | List\<[AssetVolumeStats](../../models/shared/AssetVolumeStats.md)>   | :heavy_minus_sign:                                                   | N/A                                                                  |