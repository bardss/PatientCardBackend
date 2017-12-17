package pl.patientcard.patientcard.patientApi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/patients")
class PatientController(val patientRepository: PatientRepository) {

    @GetMapping("/findByQr")
    fun findByQr(qr: String)
            = patientRepository.findByQrCode(qr)

    @PostMapping("/savePatient")
    fun savePatient(@RequestBody patient: PatientDTO): PatientDTO?
            = patientRepository.save(patient)

}
