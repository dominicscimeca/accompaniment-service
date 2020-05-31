# accompaniment-service
Accompaniment GraphQL Service

Kotlin
`https://expediagroup.github.io/graphql-kotlin/docs/getting-started.html`

Start Server
`./gradlew bootRun`

GraphQL Endpoint
`http://localhost:8080/graphql`

###GraphQL Query
####Query Random Quotation
```
query {
  randomQuote {
    text
    author
    source
  }
}
```

###GraphQL Mutation
####Add Quotation
```
mutation {
  addQuotation (quote : {
    text: "Quotation Text"
  }) {
    text
  }
}
```