package parser;

// Generated from steal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stealParser}.
 */
public interface stealListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stealParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(stealParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link stealParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(stealParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link stealParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(stealParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link stealParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(stealParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link stealParser#integerz}.
	 * @param ctx the parse tree
	 */
	void enterIntegerz(stealParser.IntegerzContext ctx);
	/**
	 * Exit a parse tree produced by {@link stealParser#integerz}.
	 * @param ctx the parse tree
	 */
	void exitIntegerz(stealParser.IntegerzContext ctx);
	/**
	 * Enter a parse tree produced by {@link stealParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(stealParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link stealParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(stealParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link stealParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(stealParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link stealParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(stealParser.CommaContext ctx);
}