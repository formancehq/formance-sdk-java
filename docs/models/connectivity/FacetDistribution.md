# FacetDistribution

Distinct-connector counts per facet value, computed from the
namespaced `facet:value` tags of the connectors matching the query.



## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `facets`                                                            | Map\<String, Map\\<String, *long*>>                                 | :heavy_check_mark:                                                  | Facet name to value-to-count map, e.g. `{"provider": {"psp": 6}}`.<br/> |
| `total`                                                             | *long*                                                              | :heavy_check_mark:                                                  | Published connectors matching the query.                            |