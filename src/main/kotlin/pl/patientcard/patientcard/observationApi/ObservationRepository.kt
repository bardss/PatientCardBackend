package pl.patientcard.patientcard.observationApi

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ObservationRepository : PagingAndSortingRepository<ObservationDTO, Long> {

    fun findByPatientId(@Param("patientId") patientId: Long): List<ObservationDTO>

}