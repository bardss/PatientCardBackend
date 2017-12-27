package pl.patientcard.patientcard.fevercardApi

import com.rsqtechnologies.health.infrastructure.converters.LocalDateAttributeConverter
import pl.patientcard.patientcard.enum.TimeOfDay
import java.time.LocalDate
import javax.persistence.*

@Entity
data class FeverCardDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val patientId: Long = 0,
        @Convert(converter = LocalDateAttributeConverter::class)
        val date: LocalDate = LocalDate.now(),
        val timeOfDay: TimeOfDay = TimeOfDay.MORNING,
        val pulse: Int = 0,
        val temperature: Int = 0)