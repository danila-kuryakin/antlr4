// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab2_4/task3/b\Task2b.g4 by ANTLR 4.7.2
package ru.kuryakin.lab2_4.task3.b;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task3bParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task3bVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task3bParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(Task3bParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3bParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Task3bParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addCoord}
	 * labeled alternative in {@link Task3bParser#ext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCoord(Task3bParser.AddCoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task3bParser#coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoord(Task3bParser.CoordContext ctx);
}