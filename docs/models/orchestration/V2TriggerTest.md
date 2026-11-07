# V2TriggerTest

Result of evaluating a trigger against a sample event, without running the workflow


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `filter`                                                    | [Optional\<Filter>](../../models/shared/Filter.md)          | :heavy_minus_sign:                                          | How the trigger's filter evaluated against the sample event |
| `variables`                                                 | Map\<String, [Variables](../../models/shared/Variables.md)> | :heavy_minus_sign:                                          | The variables the trigger would build from the sample event |