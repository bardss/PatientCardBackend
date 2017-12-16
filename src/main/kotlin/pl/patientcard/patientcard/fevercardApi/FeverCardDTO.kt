package pl.patientcard.patientcard.fevercardApi

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class FeverCardDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val patientId: Long = 0,
        val date: LocalDate = LocalDate.now(),
        val timeOfDay: String = "",
        val pulse: Float = 0F,
        val temperature: Float = 0F)