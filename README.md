# records-jsonb
Some tests using [JSONB](https://javaee.github.io/jsonb-spec/users-guide.html) with Records classes

### Serialization

Using `getters`(so-so) or [JSONB Adapters](https://javaee.github.io/jsonb-spec/docs/user-guide.html#adapters) (more verbose). 

### Deserialization [Custom Instantiation](https://javaee.github.io/jsonb-spec/docs/user-guide.html#custom-instantiation) using `@JsonbCreator`

>By default, public default no-arguments constructor is required for deserialization. In many scenarios this requirement is too strict. JSON-B provides @JsonbCreator annotation which can be used to annotate a custom constructor with parameters or a static factory method used to create a class instance.

### Yasson 1.0.6 issue

Solved in 1.0.7
```
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.eclipse.yasson.internal.ReflectionUtils (file:/Users/delabassee/.m2/repository/org/eclipse/yasson/1.0.6/yasson-1.0.6.jar) to constructor java.lang.Record()
WARNING: Please consider reporting this to the maintainers of org.eclipse.yasson.internal.ReflectionUtils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future releas
```
