package com.sap.app.configuration;

import com.sap.app.client.ConsultantClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

@Configuration
public class SOAPConfig {

    private final String ContextPath = "com.sap.app.ncg";
    private final String DefaultUri = "https://my345987.sapbydesign.com/sap/bc/srt/scs/sap/yy13iod93y_manageconsultantin?sap-vhost=my345987.sapbydesign.com";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ContextPath);
        return marshaller;
    }

    @Bean
    public ConsultantClient SOAPConnector(Jaxb2Marshaller marshaller) {
        ConsultantClient client = new ConsultantClient();
        client.setDefaultUri(DefaultUri);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        ClientInterceptor[] interceptors = new ClientInterceptor[]{wss4jSecurityInterceptor()};
        client.setInterceptors(interceptors);
        return client;
    }

    @Bean
    public Wss4jSecurityInterceptor wss4jSecurityInterceptor() {
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("Timestamp UsernameToken");
        wss4jSecurityInterceptor.setSecurementUsername("NCGCCS2");
        wss4jSecurityInterceptor.setSecurementPassword("L453r!a1r");
        return wss4jSecurityInterceptor;
    }
}
