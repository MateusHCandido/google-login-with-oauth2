package com.github.io.MateusHCandido.google_login_with_oauth2.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable().antMatcher("/**").authorizeRequests()
                .antMatchers("/", "/index.html").authenticated()
                .and()
                .oauth2Login().permitAll()
                .and()
                .logout().logoutSuccessUrl("/");
    }
}
