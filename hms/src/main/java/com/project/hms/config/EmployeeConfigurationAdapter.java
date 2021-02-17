package com.project.hms.config;

import com.project.hms.service.CustomEmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@Order(2)
public class EmployeeConfigurationAdapter extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService2(){
        return new CustomEmployeeServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder2(){
        return  new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService2()).passwordEncoder(passwordEncoder2());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/employee")
                .loginProcessingUrl("/employee/login")
                .defaultSuccessUrl("/employee/home")
                .permitAll()
                .and()
                .logout().permitAll().logoutSuccessUrl("/employee/login");
    }

}
