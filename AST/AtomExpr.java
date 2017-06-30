/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class AtomExpr{
	public AtomExpr(Atom at, Details det){
		this.at = at;
		this.det = det;
	}

	public Atom getatom(){
		return at;
	}
	public void genC(PW pw){
		if(det != null){
			at.genC(pw);
			det.genC(pw);
		}else{
			at.genC(pw);
		}
	}

	private Atom at;
	private Details det;
}
