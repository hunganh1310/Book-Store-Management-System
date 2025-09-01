package com.topcit.aims.aims.security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import com.topcit.aims.aims.entity.Customer;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
    private static final String SECRET_KEY = "TOPCIT_2025_SUPER_SECRET_KEY_FOR_JWT_TOKEN_GENERATION_1234567890";
    private static final long EXPIRATION_TIME = 3600000;

    private static final Key SIGNING_KEY = new SecretKeySpec(
        SECRET_KEY.getBytes(StandardCharsets.UTF_8),
        SignatureAlgorithm.HS512.getJcaName());

    public static String generateToken(Customer customer) {
        return Jwts.builder()
            .setSubject(customer.getEmail())
            .setIssuer("TOPCIT")
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SIGNING_KEY, SignatureAlgorithm.HS512)
            .compact();
    }
    public static String extractEmail(String token) {
        Claims claims = Jwts.parserBuilder()
            .setSigningKey(SIGNING_KEY)
            .build()
            .parseClaimsJws(token)
            .getBody();
        return claims.getSubject();
    }
}
