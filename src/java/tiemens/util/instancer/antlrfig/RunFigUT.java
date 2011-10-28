package tiemens.util.instancer.antlrfig;

import java.util.List;

public class RunFigUT 
{

    
    /**
      tiemens.util.instancer.antlrfig.RunFigUT.Site jguru {
        port = 80;
        answers = "www.jguru.com";
        aliases = ["jguru.com", "www.magelang.com"];
        menus = ["FAQ", "Forum", "Search"];
      }

      tiemens.util.instancer.antlrfig.RunFigUT.Site bea {
        answers = "bea.jguru.com";
        menus = ["FAQ", "Forum"];
       }

      tiemens.util.instancer.antlrfig.RunFigUT.Server {
        sites = [$jguru, $bea];
      }
     */
    
    /** An object type referred to in jguru.fig */
    public static class Site {
        public int port;
        private String answers;
        public List aliases;
        public List menus;

        /** The reflection support code looks for setters first then fields */
        public void setAnswers(String answers) {
            this.answers = answers;
        }

        public String toString() {
            return "Site "+answers+":"+port+"; "+aliases+", "+menus;
        }
    }

    public static class Server {
        public List sites;
    }

}
