package pl.patientcard.patientcard.fevercardApi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fevercard")
class FeverCardController(val feverCardRepository: FeverCardRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = feverCardRepository.findByPatientId(patientId)

}