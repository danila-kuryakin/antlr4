// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task14\Task14.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task14;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task14Parser}.
 */
public interface Task14Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task14Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task14Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task14Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task14Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withoutReference}
	 * labeled alternative in {@link Task14Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterWithoutReference(Task14Parser.WithoutReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withoutReference}
	 * labeled alternative in {@link Task14Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitWithoutReference(Task14Parser.WithoutReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withReference}
	 * labeled alternative in {@link Task14Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterWithReference(Task14Parser.WithReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withReference}
	 * labeled alternative in {@link Task14Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitWithReference(Task14Parser.WithReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task14Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Task14Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task14Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Task14Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task14Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Task14Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task14Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Task14Parser.ValueContext ctx);
}