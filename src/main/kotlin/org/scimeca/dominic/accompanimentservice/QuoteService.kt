package org.scimeca.dominic.accompanimentservice

import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class QuoteService(val quoteRepository: QuoteRepository) {
    fun getRandomQuote() : Quote {
        val quotes : List<Quote>  = quoteRepository.getAllQuotes()
        val randomIndex = Random.nextInt(0, quotes.size)

        return quotes[randomIndex]
    }
}