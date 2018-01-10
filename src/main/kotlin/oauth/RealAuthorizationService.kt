
import no.nowak.core.infrastructure.security.authorizationService.AuthorizationService
import oauth.DoctorRepository
import org.springframework.context.annotation.Profile
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import pl.patientcard.patientcard.DoctorApi.Doctor

@Service("authorizationService")
@Profile(AuthorizationService)
class RealAuthorizationService(val doctorRepository: DoctorRepository) : AuthorizationService {

    override fun getCurrentUser(): Doctor {
        val emailAddress: String = SecurityContextHolder.getContext().authentication.principal as String
        return doctorRepository.findByEmailAddressIgnoreCase(emailAddress) ?: throw UsernameNotFoundException("User was not found in the database.")
    }
}