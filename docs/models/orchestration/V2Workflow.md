# V2Workflow

A workflow definition and the stages it runs


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `config`                                                                                  | [V2WorkflowConfig](../../models/shared/V2WorkflowConfig.md)                               | :heavy_check_mark:                                                                        | The stages a workflow runs, in order                                                      |
| `createdAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | When the workflow was created                                                             |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | Unique identifier of the workflow                                                         |
| `updatedAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | When the workflow was last modified                                                       |