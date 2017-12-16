package pl.patientcard.patientcard

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PatientcardApplication

fun main(args: Array<String>) {
    SpringApplication.run(PatientcardApplication::class.java, *args)
}
