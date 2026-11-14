# LedgerStorage

Storage backend the ledgers are held in


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `driver`                                          | *String*                                          | :heavy_check_mark:                                | Name of the storage driver backing the ledgers    |
| `ledgers`                                         | List\<*String*>                                   | :heavy_check_mark:                                | Names of the ledgers held in this storage backend |