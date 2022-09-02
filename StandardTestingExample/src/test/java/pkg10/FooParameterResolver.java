package pkg10;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class FooParameterResolver implements ParameterResolver {
	 @Override
	  public boolean supportsParameter(ParameterContext parameterContext,ExtensionContext extensionContext) throws ParameterResolutionException {
	      return parameterContext.getParameter().getType() == Calculation.class;
	  }

	  @Override
	  public Object resolveParameter(ParameterContext parameterContext,  ExtensionContext extensionContext) throws ParameterResolutionException {
	      return new Calculation();
	  }
	

}
