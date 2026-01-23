package com.example.cas;

import org.apereo.cas.authentication.AuthenticationEventExecutionPlanConfigurer;
import org.apereo.cas.authentication.principal.PrincipalFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasConfig {

    @Bean
    public AuthenticationEventExecutionPlanConfigurer registerInternalHandler(@Qualifier("principalFactory") final PrincipalFactory principalFactory) {
        return plan -> plan.registerAuthenticationHandler(new StaticAuthenticationHandler(principalFactory));
    }
}
