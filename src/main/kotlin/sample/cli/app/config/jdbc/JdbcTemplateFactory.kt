package sample.cli.app.config.jdbc

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.inject.Named
import javax.inject.Singleton
import javax.sql.DataSource

@Factory
class JdbcTemplateFactory(
    @Named("cat") private val catDataSource: DataSource,
    @Named("dog") private val dogDataSource: DataSource
) {

    @Bean
    @Singleton
    @CatJdbcTemplate
    fun catJdbcTemplate() = NamedParameterJdbcTemplate(catDataSource)

    @Bean
    @Singleton
    @DogJdbcTemplate
    fun dogJdbcTemplate() = NamedParameterJdbcTemplate(dogDataSource)
}
