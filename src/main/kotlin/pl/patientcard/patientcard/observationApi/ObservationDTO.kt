package pl.patientcard.patientcard.observationApi

import java.time.LocalDate
import java.time.LocalTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ObservationDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val patientId: Long = 0,
        val date: LocalDate = LocalDate.now(),
        val note: String = "",
        val time: LocalTime = LocalTime.now())