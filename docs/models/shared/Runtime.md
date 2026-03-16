# Runtime

The numscript runtime used to execute the script. Uses "machine" by default, unless the "--experimental-numscript-interpreter" feature flag is passed.

## Example Usage

```java
import com.formance.formance_sdk.models.shared.Runtime;

Runtime value = Runtime.EXPERIMENTAL_INTERPRETER;
```


## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `EXPERIMENTAL_INTERPRETER` | experimental-interpreter   |
| `MACHINE`                  | machine                    |