// Generated from D:/DProject/src/main/java/ru/kuryakin/ru.kuryakin.lab2_4/task2\Example1_2.g4 by ANTLR 4.7.2
package ru.kuryakin.lab2_4.task2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task2Parser}.
 */
public interface Task2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task2Parser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(Task2Parser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task2Parser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(Task2Parser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task2Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task2Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task2Parser#ext}.
	 * @param ctx the parse tree
	 */
	void enterExt(Task2Parser.ExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task2Parser#ext}.
	 * @param ctx the parse tree
	 */
	void exitExt(Task2Parser.ExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task2Parser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(Task2Parser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task2Parser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(Task2Parser.CoordContext ctx);
}