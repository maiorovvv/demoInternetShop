package org.demointernetshop.services.auth;

import org.springframework.beans.factory.annotation.Value;

public class JwtTokenProvider {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.lifetime}")
    private long jwtLifeTime;


}
