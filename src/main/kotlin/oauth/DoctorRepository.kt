package oauth

import org.springframework.data.jpa.repository.JpaRepository
import pl.patientcard.patientcard.DoctorApi.Doctor

interface DoctorRepository: JpaRepository<Doctor, Int> {
    fun findByEmailAddressIgnoreCase(emailAddress: String): Doctor?
}