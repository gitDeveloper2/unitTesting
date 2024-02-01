//package com.gitdeveloper2.tdd.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsConfigurationSource;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecuriyConfig  {
//    public static String[]  AUTH_WHITELIST={"/home"};
//
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//    @Bean
//    CorsConfigurationSource cors(){
//        CorsConfiguration cors=new CorsConfiguration();
//        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/",cors);
//        return source;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(request ->
//                request.anyRequest().authenticated()
//                );
//        return http.build();
//
//
//    }
////    @Bean
////    AuthenticationManager authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(new MyUserDetailsService());
////        return auth.build();
////    }
//
//
//}
