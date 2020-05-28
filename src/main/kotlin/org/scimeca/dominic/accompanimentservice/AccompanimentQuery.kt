package org.scimeca.dominic.accompanimentservice

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class AccompanimentQuery : Query {
    fun randomQuote() : Quote {
        return Quote(
            text = "The earth is but one country, and mankind its citizens.",
            author = "Bahá'u'lláh",
            source = "Gleanings From the Writings of Bahá'u'lláh"
        )
    }
}
