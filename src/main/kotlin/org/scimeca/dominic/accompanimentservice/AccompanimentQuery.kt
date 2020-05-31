package org.scimeca.dominic.accompanimentservice

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class AccompanimentQuery(val quoteService: QuoteService) : Query {
    fun randomQuote() : Quote = quoteService.getRandomQuote()
}
