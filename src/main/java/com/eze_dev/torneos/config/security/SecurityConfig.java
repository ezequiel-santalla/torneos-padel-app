//package com.eze_dev.torneos.config.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http)
//            throws Exception {
//        http.authorizeHttpRequests(auth -> auth
////                .requestMatchers(HttpMethod.GET, "/api/v1/tournaments").permitAll()
////                .requestMatchers(HttpMethod.POST, "/api/v1/tournaments").authenticated()
////                .requestMatchers(HttpMethod.PUT, "/api/v1/tournaments").authenticated()
////                .requestMatchers(HttpMethod.DELETE, "/api/v1/tournaments").authenticated()
////                .requestMatchers("/api/v1/players").authenticated()
////                .anyRequest().authenticated()
//                .anyRequest().permitAll()
//        ).httpBasic(Customizer.withDefaults());
//        return http.build();
//    }
//}
