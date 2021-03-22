package com.sap.app.client;

import com.sap.app.ncg.ConsultantCreateRequest;
import com.sap.app.ncg.ConsultantCreateRequestMessageSync;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class ConsultantClient extends WebServiceGatewaySupport {

    public ConsultantCreateRequestMessageSync consultantCreateRequestMessageSync(ConsultantCreateRequest request) {

        return (ConsultantCreateRequestMessageSync) getWebServiceTemplate()
                .marshalSendAndReceive("https://my345987.sapbydesign.com/sap/bc/srt/scs/sap/yy13iod93y_manageconsultantin?sap-vhost=my345987.sapbydesign.com", request);
    }

}
