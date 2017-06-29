/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class SimpleStmt{
	public SimpleStmt (char tk, ArrayList<PrintStmt> printStmt){
		this.printStmt = printStmt;
		this.tk = tk;
	}

	public SimpleStmt (char tk, ReturnStmt ret){
		this.tk = tk;
		this.ret = ret;
	}
	
	public SimpleStmt (char tk, BreakStmt br){
		this.tk = tk;
		this.br = br;
	}

	public SimpleStmt (char tk, FuncStmt fncst){
		this.tk = tk;
		this.fncst = fncst;
	}

	public SimpleStmt (ExprStmt exstmt){
		this.exstmt = exstmt;
	}

	public void genC(PW pw){
		int i = 0;
		if(tk == 'P'){
			while(i < printStmt.size()){
				printStmt.get(i).genC(pw);
				i++;
			}
		}else if(tk == 'B'){
			br.genC(pw);
		}else if(tk == 'R'){
			ret.genC(pw);
		}else if(tk == 'F'){
			fncst.genC(pw);
		}else{
			exstmt.genC(pw);
		}
	}
	private ArrayList<PrintStmt> printStmt;
	private ExprStmt exstmt;
	private BreakStmt br;
	private char tk;
	private ReturnStmt ret;
	private FuncStmt fncst;
}