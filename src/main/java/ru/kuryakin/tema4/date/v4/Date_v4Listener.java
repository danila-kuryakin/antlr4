// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/v4\Date_v4.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Date_v4Parser}.
 */
public interface Date_v4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Date_v4Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Date_v4Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v4Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Date_v4Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v4Parser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(Date_v4Parser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v4Parser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(Date_v4Parser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v4Parser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(Date_v4Parser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v4Parser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(Date_v4Parser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v4Parser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(Date_v4Parser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v4Parser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(Date_v4Parser.MonthContext ctx);
}