package pl.patientcard.patientcard.authorization

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import pl.patientcard.patientcard.DoctorApi.DoctorRepository

@Component("userDetailsService")
class CustomUserDetailsService : UserDetailsService {

    @Autowired
    lateinit var userRepository: DoctorRepository

    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByEmailAddressIgnoreCase(username) ?: throw UsernameNotFoundException("User was not found in the database")
        return CustomUserDetails(user)
    }
}