package pl.patientcard.patientcard.observationApi

import com.rsqtechnologies.health.infrastructure.converters.LocalDateAttributeConverter
import com.rsqtechnologies.health.infrastructure.converters.LocalTimeAttributeConverter
import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.*

@Entity
data class ObservationDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val patientId: Long = 0,
        @Convert(converter = LocalDateAttributeConverter::class)
        val date: LocalDate = LocalDate.now(),
        val note: String = "",
        @Convert(converter = LocalTimeAttributeConverter::class)
        val time: LocalTime = LocalTime.now())