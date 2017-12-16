package pl.patientcard.patientcard.observationApi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/observation")
class ObservationController(val observationRepository: ObservationRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = observationRepository.findByPatientId(patientId)

}