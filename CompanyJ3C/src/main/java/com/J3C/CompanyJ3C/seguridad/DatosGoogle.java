package com.J3C.CompanyJ3C.seguridad;

import com.J3C.CompanyJ3C.services.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class DatosGoogle implements AuthenticationSuccessHandler {

    @Autowired
    EmpleadoServicio empleadoServicio;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        DefaultOidcUser user=(DefaultOidcUser) authentication.getPrincipal();
        String email=user.getEmail();
        System.out.println(user);
        System.out.println(email);
        try {
            empleadoServicio.getEmpleado(email);
            response.sendRedirect("/welcome");
        }catch (Exception e){
            //logout google
        }
    }
}
