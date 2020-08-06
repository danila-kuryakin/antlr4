// Generated from D:/DProject/src/main/java/ru/kuryakin/tema4/date/v3/a\Date_v3a.g4 by ANTLR 4.8
package ru.kuryakin.tema4.date.v3.a;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Date_v3aParser}.
 */
public interface Date_v3aListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Date_v3aParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Date_v3aParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3aParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Date_v3aParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Date_v3aParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(Date_v3aParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Date_v3aParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(Date_v3aParser.DateContext ctx);
}