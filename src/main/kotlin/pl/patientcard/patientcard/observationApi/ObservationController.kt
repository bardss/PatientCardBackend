package pl.patientcard.patientcard.observationApi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/observation")
class ObservationController(val observationRepository: ObservationRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = observationRepository.findByPatientId(patientId)

    @PostMapping("/saveObservation")
    fun saveObservation(@RequestBody observation: ObservationDTO): ObservationDTO?
            = observationRepository.save(observation)

    @DeleteMapping("/deleteObservation")
    fun deleteObservation(@RequestParam observationId: Long)
            = observationRepository.delete(observationId)

    @PutMapping("/editObservation")
    fun editObservation(@RequestBody observation: ObservationDTO): ObservationDTO?
            = observationRepository.save(observation)

}