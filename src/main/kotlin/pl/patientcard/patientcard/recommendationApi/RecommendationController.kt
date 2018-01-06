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

    @DeleteMapping("/deleteRecommendation")
    fun deleteObservation(@RequestParam recommendationId: Long)
            = recommendationRepository.delete(recommendationId)

    @PutMapping("/editRecommendation")
    fun editObservation(@RequestBody recommendation: RecommendationDTO): RecommendationDTO?
            = recommendationRepository.save(recommendation)

}