package pl.patientcard.patientcard.fevercardApi

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface FeverCardRepository : PagingAndSortingRepository<FeverCardDTO, Long> {

    fun findByPatientId(@Param("patientId") patientId: Long): List<FeverCardDTO>

}