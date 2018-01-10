package pl.patientcard.patientcard.DoctorApi

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class DoctorDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        var emailAddress: String = "",
        var name: String = "",
        var surname: String = "",
        val password: String = ""

) : Serializable
