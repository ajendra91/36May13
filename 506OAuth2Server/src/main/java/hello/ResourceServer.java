package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServer
        extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //not working

        /*http.authorizeRequests()
                .antMatchers("/principal","/demo")
                .authenticated();*/

        //working but 1 end pont

        /*http
                .antMatcher("/principal")
                .authorizeRequests().anyRequest().authenticated();*/

        //nice style
        http.requestMatchers()
                .antMatchers("/principal","/demo")
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();


    }
}