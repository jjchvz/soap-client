package com.sap.app.controller;

import com.sap.app.client.ConsultantClient;
import com.sap.app.ncg.ConsultantCreateRequest;
import com.sap.app.ncg.ConsultantCreateRequestMessageSync;
import com.sap.app.ncg.MEDIUMDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantController {

    @Autowired
    private ConsultantClient consultantClient;

    @PostMapping("/consultant-create")
    public ConsultantCreateRequestMessageSync invokeConsultantCreateRequestMessageSync(){

        MEDIUMDescription name = new MEDIUMDescription();
        MEDIUMDescription lastName = new MEDIUMDescription();

        name.setValue("Joel");
        lastName.setValue("Chavez");

        ConsultantCreateRequest request = new ConsultantCreateRequest();
        request.setId("16871423");
        request.setName(name);
        request.setLastName(lastName);
        request.setLocation("Venezuela");
        request.setStatus("Active");

        return consultantClient.consultantCreateRequestMessageSync(request);
    }
}
