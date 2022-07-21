package io.github.jmgarridopaz.coffeemachine.application;

/**
 *	DRIVEN PORT
 */
public interface ForDispensing {

	public void dispense ( Ingredient ingredient, int quantity );

	public int quantityOf(Ingredient ingredient);

}
