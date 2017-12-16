package pl.patientcard.patientcard.patientApi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/patients")
class PatientController(val patientRepository: PatientRepository) {

    @GetMapping("/findByQr")
    fun findByQr(qr: String)
            = patientRepository.findByQrCode(qr)

}
