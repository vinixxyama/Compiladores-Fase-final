/*  Vinicius Yamamoto   RA:490105
    Daniel Valim        RA:511315
*/
package AST;
import java.util.*;

public class FuncDef{
	public FuncDef(ArrayList<ArgsList> arl2, ArrayList<Declaration> decl, ArrayList<Stmt> st, String funcnome, String tipofunc){
		this.arl2 = arl2;
		this.decl = decl;
		this.st = st;
		this.funcnome = funcnome;
		this.tipofunc = tipofunc;
	}

	public String getfuncnome(){
		return funcnome;
	}

	public String getfunctipo(){
		return tipofunc;
	}

	private ArrayList<ArgsList> arl2;
	private ArrayList<Stmt> st;
	private ArrayList<Declaration> decl;
	private String funcnome;
    private String tipofunc;
}