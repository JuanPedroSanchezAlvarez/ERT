package com.ert.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ert.domain.entity.PlayableCharacter;

public interface IPlayableCharacterRepository extends CrudRepository<PlayableCharacter, Long> {

}
