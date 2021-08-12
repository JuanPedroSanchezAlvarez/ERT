package com.ert.service;

import java.util.List;

public interface ICrudService<T, ID> {

	List<T> findAll();
	T findById(Long id);
	T save(T object);
	Boolean deleteById(ID id);

}
