package no.nowak.core.infrastructure.security.authorizationService

import pl.patientcard.patientcard.DoctorApi.Doctor

interface AuthorizationService {
    fun getCurrentUser(): Doctor
}