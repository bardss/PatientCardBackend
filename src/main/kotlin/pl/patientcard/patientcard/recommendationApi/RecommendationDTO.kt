package pl.patientcard.patientcard.recommendationApi

import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class RecommendationDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val patientId: Long = 0,
        val date: LocalDate = LocalDate.now(),
        val description: String = "",
        val morning: LocalTime? = null,
        val noon: LocalTime? = null,
        val evening: LocalTime? = null,
        val night: LocalTime? = null)