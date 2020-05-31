package org.scimeca.dominic.accompanimentservice

data class Quote(
    val text: String,
    val author: String? = null,
    val source: String? = null
)