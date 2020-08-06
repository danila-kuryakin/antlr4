// Generated from D:/DProject/src/main/java/ru/kuryakin/tema2/ru.kuryakin.tema2.parse_0\Parse0.g4 by ANTLR 4.8
package ru.kuryakin.tema2.parse_0;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parse0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parse0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code OutVal}
	 * labeled alternative in {@link Parse0Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutVal(Parse0Parser.OutValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddVal}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddVal(Parse0Parser.AddValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddNum}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddNum(Parse0Parser.AddNumContext ctx);
}