// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task12\Task12.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task12;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task12Parser}.
 */
public interface Task12Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task12Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task12Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task12Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task12Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task12Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task12Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task12Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task12Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task12Parser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(Task12Parser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task12Parser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(Task12Parser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task12Parser#nameDir}.
	 * @param ctx the parse tree
	 */
	void enterNameDir(Task12Parser.NameDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task12Parser#nameDir}.
	 * @param ctx the parse tree
	 */
	void exitNameDir(Task12Parser.NameDirContext ctx);
}