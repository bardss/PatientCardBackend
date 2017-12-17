package pl.patientcard.patientcard.patientApi

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class PatientDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val name: String = "",
        val surname: String = "",
        val patientCode: String = "",
        val qrCode: String? = null
)