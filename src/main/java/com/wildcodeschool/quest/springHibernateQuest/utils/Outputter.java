package com.wildcodeschool.quest.springHibernateQuest.utils;

import com.wildcodeschool.quest.springHibernateQuest.entities.Wizard;
import com.wildcodeschool.quest.springHibernateQuest.repositories.WizardRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Wilder");

    @Autowired
    private WizardRepository wizardRepository;

    @Override
    public void run(String... args) throws Exception {

        // * CREATION
        Wizard wizard1 = new Wizard("Harry", "Potter", 25);
        wizardRepository.save(wizard1);
        Wizard wizard2 = new Wizard("Ron", "Weasley", 33);
        wizardRepository.save(wizard2);

        // * READ
        LOG.info("Users in list are ");
        for(Wizard myWizard : wizardRepository.findAll()) {
            LOG.info(myWizard.toString());
        };

        // * UPDATE
        wizard1.setFirstName("Lily");
        wizardRepository.save(wizard1);

        // * DELETE
        wizardRepository.deleteById(2L);

    }    
}