package org.demointernetshop.configuration.security;



public class SecurityConfig {
//    private final JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http
//                .cors(cors -> corsConfigurationSource())
//                .csrf(AbstractHttpConfigurer:: disable)
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/api/auth").permitAll()
//                        .requestMatchers("/api/products/**").permitAll()
//                        .requestMatchers("/api/products/category/**").permitAll()
//                        .requestMatchers("/api/products/manufacturer/**").permitAll()
//                        .requestMatchers("/api/users/**"). hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
//                        .requestMatchers("/api/orders/**").hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
//                        .anyRequest().authenticated())
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(List.of("*"));
//        configuration.setAllowedMethods(List.of("*"));
//        configuration.setAllowedHeaders(List.of("*"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//        //return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }

}
