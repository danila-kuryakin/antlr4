// Generated from D:/DProject/src/main/java/ru/kuryakin/tema2/ru.kuryakin.tema2.parse_0\Parse0.g4 by ANTLR 4.8
package ru.kuryakin.tema2.parse_0;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link Parse0Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Parse0BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements Parse0Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOutVal(Parse0Parser.OutValContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAddVal(Parse0Parser.AddValContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAddNum(Parse0Parser.AddNumContext ctx) { return visitChildren(ctx); }
}