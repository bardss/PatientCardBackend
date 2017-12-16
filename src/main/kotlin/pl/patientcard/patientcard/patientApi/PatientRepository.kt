package pl.patientcard.patientcard.patientApi

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PatientRepository : PagingAndSortingRepository<PatientDTO, Long> {

    fun findByPatientCode(@Param("qr") patientCode: String): List<PatientDTO>

}