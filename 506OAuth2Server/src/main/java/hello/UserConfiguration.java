/*package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    /*PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();


    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin")
                .password(passwordEncoder.encode("admin"))
                .roles("USER","AMIN","MANAGER")
                .authorities("CAN_READ","CAN_WRITE","CAN_DELETE");

                //.and().withUser("aa2").password("pa2").roles("USER")
                //.authorities("CAN_READ","CAN_WRITE");
    }

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin")
                .password(fun().encode("admin")).roles("ADMIN","USER");
    }

    @Bean
    public NoOpPasswordEncoder fun(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
*/