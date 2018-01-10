package no.nowak.core.infrastructure.security.authorizationService

import pl.patientcard.patientcard.DoctorApi.DoctorDTO

interface AuthorizationService {
    fun getCurrentUser(): DoctorDTO
}