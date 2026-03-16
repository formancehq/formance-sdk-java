# V2LogDataInsertedSchema

Payload for INSERTED_SCHEMA log entries. Contains the schema that was inserted into the ledger.


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `schema`                                    | [V2Schema](../../models/shared/V2Schema.md) | :heavy_check_mark:                          | Complete schema structure with metadata     |