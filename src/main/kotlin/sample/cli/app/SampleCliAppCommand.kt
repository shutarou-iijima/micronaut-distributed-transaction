package sample.cli.app

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import javax.inject.Singleton

@Singleton
@Command(name = "sample-cli-app", description = ["..."],
        mixinStandardHelpOptions = true)
class SampleCliAppCommand(
    private val service: SampleService
) : Runnable {

    override fun run() {
        service.insertCatAndDog()
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            PicocliRunner.run(SampleCliAppCommand::class.java, *args)
        }
    }
}
