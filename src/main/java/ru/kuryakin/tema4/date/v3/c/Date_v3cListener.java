// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/c\Date_v3c.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.c;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Date_v3cParser}.
 */
public interface Date_v3cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Date_v3cParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Date_v3cParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3cParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Date_v3cParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v3cParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(Date_v3cParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3cParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(Date_v3cParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v3cParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(Date_v3cParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3cParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(Date_v3cParser.MonthContext ctx);
}