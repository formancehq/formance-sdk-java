# QueryCapabilities

The filterable keys per resource, serialized from the same allowlist
the server enforces -- it cannot drift from what queries accept.



## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `resources`                                                                                      | Map\<String, Map\\<String, [QueryFieldCapability](../../models/shared/QueryFieldCapability.md)>> | :heavy_check_mark:                                                                               | N/A                                                                                              |