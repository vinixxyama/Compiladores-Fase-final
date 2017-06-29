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
    	int i;
    	pw.out.println("#include <stdio.h>");
        pw.out.println("#include <string.h>");
        pw.out.println("");
    	for(i=0;i<fncdef.size();i++){
    		fncdef.get(i).genC(pw);
            if(i != fncdef.size()-1){
                pw.out.println("");
            }
    	}
    }                        

    private ArrayList<FuncDef> fncdef;
}