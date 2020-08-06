// Generated from D:/DProject/src/main/java/ru/kuryakin/tema2/ru.kuryakin.tema2.parse_0\Parse0.g4 by ANTLR 4.8
package ru.kuryakin.tema2.parse_0;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parse0Parser}.
 */
public interface Parse0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code OutVal}
	 * labeled alternative in {@link Parse0Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterOutVal(Parse0Parser.OutValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutVal}
	 * labeled alternative in {@link Parse0Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitOutVal(Parse0Parser.OutValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddVal}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterAddVal(Parse0Parser.AddValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddVal}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitAddVal(Parse0Parser.AddValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddNum}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterAddNum(Parse0Parser.AddNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddNum}
	 * labeled alternative in {@link Parse0Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitAddNum(Parse0Parser.AddNumContext ctx);
}