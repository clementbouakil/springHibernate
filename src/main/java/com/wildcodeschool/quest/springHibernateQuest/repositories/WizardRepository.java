package com.wildcodeschool.quest.springHibernateQuest.repositories;

import com.wildcodeschool.quest.springHibernateQuest.entities.Wizard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> { }