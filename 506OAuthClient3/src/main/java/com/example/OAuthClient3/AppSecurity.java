/*package com.example.OAuthClient3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;


@Configuration
@EnableOAuth2Sso
public class AppSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    public OAuth2ClientContext oauth2ClientContext;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests()
                .antMatchers("/", "/login**")
                .permitAll().anyRequest()
                .authenticated();

        http.authorizeRequests().and().logout()
                .logoutUrl("/logout").logoutSuccessUrl("/");

    }

}*/