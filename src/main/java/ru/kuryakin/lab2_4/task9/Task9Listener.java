// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task9\Task9.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task9;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task9Parser}.
 */
public interface Task9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task9Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task9Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task9Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task9Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task9Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(Task9Parser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task9Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(Task9Parser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task9Parser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Task9Parser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task9Parser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Task9Parser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withoutVar}
	 * labeled alternative in {@link Task9Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterWithoutVar(Task9Parser.WithoutVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withoutVar}
	 * labeled alternative in {@link Task9Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitWithoutVar(Task9Parser.WithoutVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withVar}
	 * labeled alternative in {@link Task9Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterWithVar(Task9Parser.WithVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withVar}
	 * labeled alternative in {@link Task9Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitWithVar(Task9Parser.WithVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task9Parser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(Task9Parser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task9Parser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(Task9Parser.NamesContext ctx);
}