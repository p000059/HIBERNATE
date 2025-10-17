package com.hibernate.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hibernate.Interfaces.CRUD;


public class GenericMethods<T> implements CRUD<T> {
	

	@Override
	public T create(T object) {

		T outPutObject = null;

		try {

			

		} catch (Exception e) {

			
			e.printStackTrace();

		} finally {

			
		}

		return outPutObject;
	}

	@Override
	public List<T> read(Class<T> object) {

		List<T> outPutList = new ArrayList<>();

		try {

			

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			
		}

		return outPutList;
	}

	@Override
	public T findById(Class<T> objectClass, Long objectID) {

		T outPutObject = null;

		try {

			

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			
		}

		return outPutObject;
	}

	public T findByName(Class<T> objectClass, String object) {

		T outPutObject = null;

		try {

			

		} catch (Exception e) {

			

		} finally {

			
		}

		return outPutObject;
	}

	@Override
	public void update(T object) {

		try {

			

		} catch (Exception e) {

			

		} finally {

			
		}
	}

	@Override
	public void delete(T object) {

		Collection<String> cl = new ArrayList<>(); 
		
		try {

			

		} catch (Exception e) {

			
			e.printStackTrace();

		} finally {

			
		}
	}

	@Override
	public void deleteById(Class<T> objectClass, Long id) {

		T objectSource = findById(objectClass, id);

		try {

			

		} catch (Exception e) {

			
			e.printStackTrace();

		} finally {

			
		}
	}
}
