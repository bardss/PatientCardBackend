package pl.patientcard.patientcard.observationApi

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import pl.patientcard.patientcard.recommendationApi.RecommendationDTO

@Repository
interface RecommendationRepository : PagingAndSortingRepository<RecommendationDTO, Long> {

    fun findByPatientId(@Param("patientId") patientId: Long): List<RecommendationDTO>

}