/*
 * Copyright (c) 2021. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.digibp.classroom.service;

import onl.mrtn.camunda.pmml.PMMLEvaluator;
import org.camunda.bpm.engine.RepositoryService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class PMMLService extends PMMLEvaluator {

    @Inject
    public PMMLService(RepositoryService repositoryService){
        super(repositoryService);
    }
}
