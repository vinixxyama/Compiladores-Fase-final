/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/

package AST;

import java.util.*;
import java.util.ArrayList;

public class Program {
    public Program(ArrayList<FuncDef> fncdef){
    	this.fncdef = fncdef;
    }

    public void genC(PW pw) {
    }                        

    private ArrayList<FuncDef> fncdef;
}