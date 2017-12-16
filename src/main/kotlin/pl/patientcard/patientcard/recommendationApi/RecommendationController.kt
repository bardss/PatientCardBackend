package pl.patientcard.patientcard.observationApi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/recommendation")
class RecommendationController(val recommendationRepository: RecommendationRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = recommendationRepository.findByPatientId(patientId)

}