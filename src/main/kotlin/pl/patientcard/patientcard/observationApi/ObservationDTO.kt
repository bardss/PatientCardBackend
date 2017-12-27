package pl.patientcard.patientcard.observationApi

import com.rsqtechnologies.health.infrastructure.converters.LocalDateTimeAttributeConverter
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class ObservationDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val patientId: Long = 0,
        val employee: String = "",
        @Convert(converter = LocalDateTimeAttributeConverter::class)
        val dateTime: LocalDateTime = LocalDateTime.now(),
        val note: String = ""
)
