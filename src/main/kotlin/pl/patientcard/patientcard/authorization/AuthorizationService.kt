package pl.patientcard.patientcard.authorization

import pl.patientcard.patientcard.DoctorApi.DoctorDTO

interface AuthorizationService {
    fun getCurrentUser(): DoctorDTO
}