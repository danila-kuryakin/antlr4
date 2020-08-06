// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task11\Task11.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task11;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task11Parser}.
 */
public interface Task11Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task11Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task11Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task11Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task11Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task11Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Task11Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task11Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Task11Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task11Parser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Task11Parser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task11Parser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Task11Parser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withoutReference}
	 * labeled alternative in {@link Task11Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterWithoutReference(Task11Parser.WithoutReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withoutReference}
	 * labeled alternative in {@link Task11Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitWithoutReference(Task11Parser.WithoutReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withReference}
	 * labeled alternative in {@link Task11Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterWithReference(Task11Parser.WithReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withReference}
	 * labeled alternative in {@link Task11Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitWithReference(Task11Parser.WithReferenceContext ctx);
}