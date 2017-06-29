
/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class FuncStmt{
	public FuncStmt(char op, String funcvar, OrTest ort){
		this.funcvar = funcvar;
		this.ort = ort;
		this.op = op;
	}

	public void genC(PW pw) {
		pw.print(funcvar+"(");
		if(op != '\0'){
			pw.out.print(op);
			ort.genC(pw);
		}else{
			ort.genC(pw);
		}
		pw.out.println(");");
	}

	private char op;
	private String funcvar;
	private OrTest ort;
}