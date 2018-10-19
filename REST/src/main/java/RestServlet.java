package com.miracle.rest.Routes;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup = 1, displayName = "com.miracle.rest.Routes.RestServlet", urlPatterns = "/api/*", name = "com.miracle.rest.Routes.RestServlet")
public class RestServlet extends CamelHttpTransportServlet {
}
