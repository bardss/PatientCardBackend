
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer
import org.springframework.security.oauth2.provider.token.TokenStore
import pl.patientcard.patientcard.Paths
import javax.servlet.http.HttpServletResponse

//@Profile("!test")
@Configuration
@EnableResourceServer
class ResourceServer : ResourceServerConfigurerAdapter() {

    @Autowired
    lateinit var tokenStore: TokenStore

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint { _, response, _ -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED) }
                .and()
                .authorizeRequests()
                .antMatchers(
                        "/v2/api-docs",
                        "/configuration/ui",
                        "/swagger-resources/**",
                        "/configuration/**",
                        "/swagger-ui.html",
                        "/webjars/**",
                        "${Paths.PASSWORD_PATH}/**"
                ).permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .httpBasic().disable()
    }

    override fun configure(resources: ResourceServerSecurityConfigurer?) {
        resources!!
                .tokenStore(tokenStore)
                .resourceId("gpsTracker")
    }
}