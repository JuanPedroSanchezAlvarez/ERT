package com.ert.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ert.domain.entity.Spell;

public interface ISpellRepository extends CrudRepository<Spell, Long> {

}
