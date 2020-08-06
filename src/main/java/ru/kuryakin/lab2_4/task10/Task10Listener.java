// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task10\Task10.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task10;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task10Parser}.
 */
public interface Task10Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task10Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task10Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task10Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task10Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link Task10Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterNull(Task10Parser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link Task10Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitNull(Task10Parser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withList}
	 * labeled alternative in {@link Task10Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterWithList(Task10Parser.WithListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withList}
	 * labeled alternative in {@link Task10Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitWithList(Task10Parser.WithListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endNumber}
	 * labeled alternative in {@link Task10Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void enterEndNumber(Task10Parser.EndNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endNumber}
	 * labeled alternative in {@link Task10Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void exitEndNumber(Task10Parser.EndNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyList}
	 * labeled alternative in {@link Task10Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void enterOnlyList(Task10Parser.OnlyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyList}
	 * labeled alternative in {@link Task10Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void exitOnlyList(Task10Parser.OnlyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task10Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task10Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task10Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task10Parser.ListContext ctx);
}