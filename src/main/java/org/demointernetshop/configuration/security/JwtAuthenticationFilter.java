package org.demointernetshop.configuration.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import liquibase.util.StringUtil;
import lombok.RequiredArgsConstructor;

import org.demointernetshop.services.auth.JwtTokenProvider;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


public class JwtAuthenticationFilter  {

//    private final JwtTokenProvider tokenProvider;
//    private final CustomUserDetailService customUserDetailService;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//            try {
//                String jwt = getJwtFromRequest(request);
//
//                if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
//                    String userName = tokenProvider.getManagerNameFromJWT(jwt);
//                    UserDetails userDetails = customUserDetailService.loadUserByUserName(userName);
//                    Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//        } catch (Exception e) {
//                logger.error("Could not set user authentication in security context", e);
//            }
//    }
//
//    private String getJwtFromRequest(HttpServletRequest request){
//        String bearerToken = request.getHeader("Authorization");
//        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
//            return bearerToken.substring(7);
//        }
//        return null;
//    }
}
