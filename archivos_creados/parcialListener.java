// Generated from parcial.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parcialParser}.
 */
public interface parcialListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parcialParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parcialParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parcialParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(parcialParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(parcialParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(parcialParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(parcialParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(parcialParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(parcialParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#cincoutStatement}.
	 * @param ctx the parse tree
	 */
	void enterCincoutStatement(parcialParser.CincoutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#cincoutStatement}.
	 * @param ctx the parse tree
	 */
	void exitCincoutStatement(parcialParser.CincoutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(parcialParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(parcialParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(parcialParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(parcialParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(parcialParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(parcialParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(parcialParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(parcialParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(parcialParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(parcialParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(parcialParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(parcialParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(parcialParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(parcialParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(parcialParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(parcialParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(parcialParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(parcialParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(parcialParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(parcialParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#forCond}.
	 * @param ctx the parse tree
	 */
	void enterForCond(parcialParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#forCond}.
	 * @param ctx the parse tree
	 */
	void exitForCond(parcialParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(parcialParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(parcialParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(parcialParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(parcialParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#corcht}.
	 * @param ctx the parse tree
	 */
	void enterCorcht(parcialParser.CorchtContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#corcht}.
	 * @param ctx the parse tree
	 */
	void exitCorcht(parcialParser.CorchtContext ctx);
	/**
	 * Enter a parse tree produced by {@link parcialParser#sumatoria}.
	 * @param ctx the parse tree
	 */
	void enterSumatoria(parcialParser.SumatoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link parcialParser#sumatoria}.
	 * @param ctx the parse tree
	 */
	void exitSumatoria(parcialParser.SumatoriaContext ctx);
}