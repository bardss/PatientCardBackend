package pl.patientcard.patientcard.DoctorApi

import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepository: JpaRepository<DoctorDTO, Int> {
    fun findByEmailAddressIgnoreCase(emailAddress: String): DoctorDTO?
}