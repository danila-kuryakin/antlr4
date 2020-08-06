// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task13\Task13.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task13;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task13Parser}.
 */
public interface Task13Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task13Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task13Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task13Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task13Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task13Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Task13Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task13Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Task13Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code segment}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void enterSegment(Task13Parser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code segment}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void exitSegment(Task13Parser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endNumber}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void enterEndNumber(Task13Parser.EndNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endNumber}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void exitEndNumber(Task13Parser.EndNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyList}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void enterOnlyList(Task13Parser.OnlyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyList}
	 * labeled alternative in {@link Task13Parser#listEnd}.
	 * @param ctx the parse tree
	 */
	void exitOnlyList(Task13Parser.OnlyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task13Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task13Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task13Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task13Parser.ListContext ctx);
}