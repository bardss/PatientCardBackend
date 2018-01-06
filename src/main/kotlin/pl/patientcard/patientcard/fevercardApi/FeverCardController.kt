package pl.patientcard.patientcard.fevercardApi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/fevercard")
class FeverCardController(val feverCardRepository: FeverCardRepository) {

    @GetMapping("/findByPatientId")
    fun findByPatientId(patientId: Long)
            = feverCardRepository.findByPatientId(patientId)

    @PostMapping("/saveFeverCard")
    fun saveFeverCard(@RequestBody feverCard: FeverCardDTO): FeverCardDTO?
            = feverCardRepository.save(feverCard)

    @DeleteMapping("/deleteFeverCard")
    fun deleteFeverCard(@RequestParam feverCardId: Long)
            = feverCardRepository.delete(feverCardId)

    @PutMapping("/editFeverCard")
    fun editFeverCard(@RequestBody feverCard: FeverCardDTO): FeverCardDTO?
            = feverCardRepository.save(feverCard)
}