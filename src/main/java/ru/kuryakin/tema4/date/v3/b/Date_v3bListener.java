// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/b\Date_v3b.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.b;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Date_v3bParser}.
 */
public interface Date_v3bListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Date_v3bParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Date_v3bParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3bParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Date_v3bParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v3bParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(Date_v3bParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3bParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(Date_v3bParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v3bParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(Date_v3bParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3bParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(Date_v3bParser.MonthContext ctx);
}