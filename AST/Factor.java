/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.ArrayList;

public class Factor{
	public Factor(AtomExpr atex, char op){
		this.atex = atex;
		this.op = op;
	}

	public AtomExpr getatomexpr(){
		return atex;
	}

	public void genC(PW pw){
		if(op != '\0'){
			pw.out.print(op);
			atex.genC(pw);
		}else{
			atex.genC(pw);
		}
    }

	private AtomExpr atex;
	private char op;
}