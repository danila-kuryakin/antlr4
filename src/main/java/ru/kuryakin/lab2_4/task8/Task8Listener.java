// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task8\Task8.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task8;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task8Parser}.
 */
public interface Task8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task8Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task8Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task8Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task8Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task8Parser#dir}.
	 * @param ctx the parse tree
	 */
	void enterDir(Task8Parser.DirContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task8Parser#dir}.
	 * @param ctx the parse tree
	 */
	void exitDir(Task8Parser.DirContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task8Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Task8Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task8Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Task8Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code none}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterNone(Task8Parser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code none}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitNone(Task8Parser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Task8Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Task8Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code litters}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterLitters(Task8Parser.LittersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code litters}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitLitters(Task8Parser.LittersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dup}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterDup(Task8Parser.DupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dup}
	 * labeled alternative in {@link Task8Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitDup(Task8Parser.DupContext ctx);
}