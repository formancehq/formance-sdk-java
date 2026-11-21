# StageDelay


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `duration`                                                                                | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | Wait for this long, expressed as a Go duration such as 10s. Mutually exclusive with until |
| `until`                                                                                   | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Wait until this absolute point in time. Mutually exclusive with duration                  |