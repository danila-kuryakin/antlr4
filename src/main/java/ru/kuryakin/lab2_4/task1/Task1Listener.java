// Generated from D:/DProject/src/main/java/ru/kuryakin/lab2_4/task1\Task1.g4 by ANTLR 4.8
package ru.kuryakin.lab2_4.task1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task1Parser}.
 */
public interface Task1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task1Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Task1Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Task1Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftL}
	 * labeled alternative in {@link Task1Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterLeftL(Task1Parser.LeftLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftL}
	 * labeled alternative in {@link Task1Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitLeftL(Task1Parser.LeftLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code L}
	 * labeled alternative in {@link Task1Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterL(Task1Parser.LContext ctx);
	/**
	 * Exit a parse tree produced by the {@code L}
	 * labeled alternative in {@link Task1Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitL(Task1Parser.LContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHex(Task1Parser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHex(Task1Parser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reiteration}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterReiteration(Task1Parser.ReiterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reiteration}
	 * labeled alternative in {@link Task1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitReiteration(Task1Parser.ReiterationContext ctx);
}