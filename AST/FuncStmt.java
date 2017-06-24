
/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class FuncStmt{
	public FuncStmt(String funcvar, OrTest ort){
		this.funcvar = funcvar;
		this.ort = ort;
	}

	private String funcvar;
	private OrTest ort;
}