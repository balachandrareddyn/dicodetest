package com.bala.codetest.di.dependency.impl;

import java.util.HashMap;
import java.util.Map;

import com.bala.codetest.di.dependency.Dependency;

public abstract class AbstractDependency implements Dependency {

	private final Map<Class<?>, Class<?>> classMap = new HashMap<>();

	protected <T> void createMapping(final Class<T> baseClass, final Class<? extends T> subClass) {
		classMap.put(baseClass, subClass.asSubclass(baseClass));
	}

	@Override
	public <T> Class<? extends T> getMapping(final Class<T> type) {
		final Class<?> implementation = classMap.get(type);
		if (implementation == null) {
			throw new IllegalArgumentException("Unable to  find the mapping : " + type);
		}
		return implementation.asSubclass(type);
	}
}