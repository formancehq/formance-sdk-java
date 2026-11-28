# Payload

Named system payload variants are preserved as supplied, including
nested fields and future sibling variants. Only apply is typed here;
other variants remain open-ended (EN-2781).



## Fields

| Field                                            | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `additionalProperties`                           | Map\<String, *Object*>                           | :heavy_minus_sign:                               | N/A                                              |
| `apply`                                          | [Optional\<Apply>](../../models/shared/Apply.md) | :heavy_minus_sign:                               | N/A                                              |