package pl.patientcard.patientcard.observationApi

import org.springframework.web.bind.annotation.*
import pl.patientcard.patientcard.recommendationApi.RecommendationDTO

@RestController
@RequestMapping("/recommendation")
class RecommendationController(val recommendationRepository: RecommendationRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = recommendationRepository.findByPatientId(patientId)

    @PostMapping("/saveRecommendation")
    fun saveObservation(@RequestBody recommendation: RecommendationDTO): RecommendationDTO?
            = recommendationRepository.save(recommendation)

}