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

//class Query {
//	fun getNumber() = 1
//}
//
//val config = SchemaGeneratorConfig(listOf("org.scimeca.dominic.accompanimentservice"))
//val queries = listOf(TopLevelObject(Query()))
//val schema: GraphQLSchema = toSchema(config = config, queries = queries)
