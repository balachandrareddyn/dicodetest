package com.bala.codetest.di.dependency;

public interface Dependency {

	void configure();

	<T> Class<? extends T> getMapping(Class<T> type);
}