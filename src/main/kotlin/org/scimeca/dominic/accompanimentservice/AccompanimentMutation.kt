package org.scimeca.dominic.accompanimentservice

import com.expediagroup.graphql.spring.operations.Mutation
import org.springframework.stereotype.Component

@Component
class AccompanimentMutation : Mutation {
    fun addQuotation(quote: Quote): Quote {
        return quote;
    }
}