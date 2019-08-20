package sample.cli.app

import io.micronaut.spring.tx.annotation.Transactional
import sample.cli.app.dao.CatDao
import sample.cli.app.dao.DogDao
import javax.inject.Singleton

@Singleton
open class SampleService(
    private val catDao: CatDao,
    private val dogDao: DogDao
) {

    @Transactional
    open fun insertCatAndDog() {
        catDao.insert()
        dogDao.insert()

        throw Exception("TRANSACTION TEST ERROR")
    }
}
