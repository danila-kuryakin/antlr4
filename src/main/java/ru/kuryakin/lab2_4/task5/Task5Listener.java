// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task5\Task5.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task5;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task5Parser}.
 */
public interface Task5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task5Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task5Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task5Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task5Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task5Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task5Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task5Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task5Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task5Parser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(Task5Parser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task5Parser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(Task5Parser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task5Parser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(Task5Parser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task5Parser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(Task5Parser.TimeContext ctx);
}