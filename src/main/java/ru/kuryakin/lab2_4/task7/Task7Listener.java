// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task7\Task7.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task7;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task7Parser}.
 */
public interface Task7Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code intermediate}
	 * labeled alternative in {@link Task7Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterIntermediate(Task7Parser.IntermediateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intermediate}
	 * labeled alternative in {@link Task7Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitIntermediate(Task7Parser.IntermediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code end}
	 * labeled alternative in {@link Task7Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterEnd(Task7Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code end}
	 * labeled alternative in {@link Task7Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitEnd(Task7Parser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task7Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task7Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task7Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task7Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code frame}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterFrame(Task7Parser.FrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code frame}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitFrame(Task7Parser.FrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Task7Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Task7Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xCoord}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterXCoord(Task7Parser.XCoordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xCoord}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitXCoord(Task7Parser.XCoordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yCoord}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterYCoord(Task7Parser.YCoordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yCoord}
	 * labeled alternative in {@link Task7Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitYCoord(Task7Parser.YCoordContext ctx);
}