package com.redhat.depositretention.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class DroolsSessionFactory {

    protected static KieSession createDroolsSession() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession =  kieContainer.newKieSession();
        return kieSession;
    }

}
