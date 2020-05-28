package org.scimeca.dominic.accompanimentservice

import com.expediagroup.graphql.SchemaGeneratorConfig
import com.expediagroup.graphql.TopLevelObject
import com.expediagroup.graphql.toSchema
import graphql.schema.GraphQLSchema
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccompanimentServiceApplication

fun main(args: Array<String>) {
	runApplication<AccompanimentServiceApplication>(*args)
}
