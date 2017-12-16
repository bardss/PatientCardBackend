package pl.patientcard.patientcard.recommendationApi

import com.rsqtechnologies.health.infrastructure.converters.LocalDateAttributeConverter
import com.rsqtechnologies.health.infrastructure.converters.LocalTimeAttributeConverter
import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.*

@Entity
data class RecommendationDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val patientId: Long = 0,
        @Convert(converter = LocalDateAttributeConverter::class)
        val date: LocalDate = LocalDate.now(),
        val description: String = "",
        @Convert(converter = LocalTimeAttributeConverter::class)
        val morning: LocalTime? = null,
        @Convert(converter = LocalTimeAttributeConverter::class)
        val noon: LocalTime? = null,
        @Convert(converter = LocalTimeAttributeConverter::class)
        val evening: LocalTime? = null,
        @Convert(converter = LocalTimeAttributeConverter::class)
        val night: LocalTime? = null)