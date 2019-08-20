package sample.cli.app.dao

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import sample.cli.app.config.jdbc.DogJdbcTemplate
import javax.inject.Singleton

@Singleton
class DogDao(
    @DogJdbcTemplate private val dogJdbcTemplate: NamedParameterJdbcTemplate
) {

    fun insert() {
        dogJdbcTemplate.update(
            "INSERT INTO dog (name) VALUES ('a')",
            MapSqlParameterSource()
        )
    }
}
