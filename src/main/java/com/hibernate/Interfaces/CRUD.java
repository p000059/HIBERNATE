package com.hibernate.Interfaces;

import java.util.List;

public interface CRUD<T> {

	T create(T object);
	List<T> read(Class<T> object);
	T findById(Class<T> objectClass, Long objectID);
	T findByName(Class<T> objectClass, String object);
	void update(T object);
	void delete(T object);
	void deleteById(Class<T> objectClass, Long id);
	
	
}
