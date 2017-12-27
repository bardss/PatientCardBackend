package pl.patientcard.patientcard.fevercardApi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/fevercard")
class FeverCardController(val feverCardRepository: FeverCardRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = feverCardRepository.findByPatientId(patientId)

    @PostMapping("/saveFeverCard")
    fun saveObservation(@RequestBody feverCard: FeverCardDTO): FeverCardDTO?
            = feverCardRepository.save(feverCard)

}