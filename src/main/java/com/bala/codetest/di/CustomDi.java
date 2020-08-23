package com.bala.codetest.di;

import com.bala.codetest.di.dependency.Dependency;

public final class CustomDi {

	private CustomDi() {
		
	}
	
    public static CustomDiFramework getFramework(final Dependency module) {
        module.configure();
        return new CustomDiFramework(module);
    }
}