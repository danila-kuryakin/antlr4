// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab2_4/task4\Task4.g4 by ANTLR 4.7.2
package ru.kuryakin.lab2_4.task4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task4Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(Task4Parser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task4Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Task4Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code count1}
	 * labeled alternative in {@link Task4Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount1(Task4Parser.Count1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code count2}
	 * labeled alternative in {@link Task4Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount2(Task4Parser.Count2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link Task4Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(Task4Parser.SkipContext ctx);
}