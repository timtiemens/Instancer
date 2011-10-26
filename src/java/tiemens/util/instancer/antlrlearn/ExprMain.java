/*========================================================================
 * TemplateLGPL.java
 * 2011 Oct 31 11:05:47 PM | ttiemens
 * Copyright (c) 2011 Tim Tiemens
 *========================================================================
 * This file is part of Instancer.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package tiemens.util.instancer.antlrlearn;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

public class ExprMain
{
    public static void main(String[] args) throws Exception 
    {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.prog();
        
        List<Integer> list = new ArrayList<Integer>();
        //System.out.println(Arrays.)
        
        
//        SimpleCalcLexer lex = new SimpleCalcLexer(new ANTLRFileStream(args[0]));
//        CommonTokenStream tokens = new CommonTokenStream(lex);

//        SimpleCalcParser parser = new SimpleCalcParser(tokens);

//        try {
//            parser.expr();
//        } catch (RecognitionException e)  {
//            e.printStackTrace();
//        }
    }
}