/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.ArrayList;

public class Factor{
	public Factor(AtomExpr atex, char pm, char op){
		this.atex = atex;
		this.pm = pm;
		this.op = op;
	}

	public AtomExpr getatomexpr(){
		return atex;
	}

	public void genC(PW pw){
		if(op != '\0'){
			if(pm != '\0'){
				pw.out.print(pm);
				atex.genC(pw);
				pw.out.print(op);
			}else{
				atex.genC(pw);
				pw.out.print(op);
			}

		}else{
			if(pm != '\0'){
				pw.out.print(pm);
				atex.genC(pw);
			}else{
				atex.genC(pw);
			}
		}
    }

    private char op;
	private AtomExpr atex;
	private char pm;
}