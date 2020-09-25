package com.springboot.clienteapp.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.SessionFlashMapManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccesMessage  extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        SessionFlashMapManager flashMapManager= new SessionFlashMapManager();
        FlashMap fMap = new FlashMap();
        fMap.put("succes","Bienvenid@ , Has iniciado sesion con exio");
        flashMapManager.saveOutputFlashMap(fMap,request,response);
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
