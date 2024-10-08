//package com.api_gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//
//        httpSecurity
//                .authorizeHttpRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/").permitAll()
//                                .anyRequest()
//                                .authenticated()
//                )
//                .oauth2Login(Customizer.withDefaults())
//                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())
//                );
//        return httpSecurity.build();
//
//    }
//}
