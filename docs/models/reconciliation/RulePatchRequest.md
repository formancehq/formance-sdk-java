# RulePatchRequest

Partial update — only fields supplied are applied.


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `enabled`                                                      | *Optional\<Boolean>*                                           | :heavy_minus_sign:                                             | N/A                                                            |
| `labels`                                                       | Map\<String, *String*>                                         | :heavy_minus_sign:                                             | N/A                                                            |
| `name`                                                         | *Optional\<String>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `notifications`                                                | List\<*String*>                                                | :heavy_minus_sign:                                             | N/A                                                            |
| `schedule`                                                     | [Optional\<Schedule>](../../models/shared/Schedule.md)         | :heavy_minus_sign:                                             | N/A                                                            |
| `severity`                                                     | [Optional\<Severity>](../../models/shared/Severity.md)         | :heavy_minus_sign:                                             | N/A                                                            |
| `templateKind`                                                 | [Optional\<TemplateKind>](../../models/shared/TemplateKind.md) | :heavy_minus_sign:                                             | N/A                                                            |
| `templateSpec`                                                 | Map\<String, *Object*>                                         | :heavy_minus_sign:                                             | N/A                                                            |