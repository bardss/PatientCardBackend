package pl.patientcard.patientcard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@SpringBootApplication
class PatientcardApplication{

//    @Autowired
//    lateinit var doctorDetailsService: DoctorDetailsService

    @Bean
    fun encoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Autowired
    @Throws(Exception::class)
    fun authenticationManager(builder: AuthenticationManagerBuilder) {
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(PatientcardApplication::class.java, *args)
}
