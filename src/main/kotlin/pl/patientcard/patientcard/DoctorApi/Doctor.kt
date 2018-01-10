package pl.patientcard.patientcard.DoctorApi
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "[doctor]")
data class Doctor(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        var emailAddress: String,
        var name: String,
        var surname: String,
        val password: String

) : Serializable {
}
