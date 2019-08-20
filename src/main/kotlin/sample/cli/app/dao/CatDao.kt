package sample.cli.app.dao

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import sample.cli.app.config.jdbc.CatJdbcTemplate
import javax.inject.Singleton

@Singleton
class CatDao(
    @CatJdbcTemplate private val catJdbcTemplate: NamedParameterJdbcTemplate
) {

    fun insert() {
        catJdbcTemplate.update(
            "INSERT INTO cat (name) VALUES ('a')",
            MapSqlParameterSource()
        )
    }
}
