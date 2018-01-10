package oauth

import org.springframework.data.jpa.repository.JpaRepository
import pl.patientcard.patientcard.DoctorApi.DoctorDTO

interface DoctorRepository: JpaRepository<DoctorDTO, Int> {
    fun findByEmailAddressIgnoreCase(emailAddress: String): DoctorDTO?
}