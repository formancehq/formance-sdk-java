# ResumeActivityRequestBody


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `pausedAt`                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)      | :heavy_check_mark:                                                                             | Nonzero RFC3339 timestamp from the paused activity projection identifying the pause generation |
| `temporalRunID`                                                                                | *String*                                                                                       | :heavy_check_mark:                                                                             | Expected Temporal run id from the paused activity projection                                   |