import shuffle.Abstract;
import shuffle.*;

import java.io.IOException;

/**
 * Created by ajaaz on 29/3/17.
 */
public class tezt {
    /**
     * Created by ajaaz on 29/3/17.
     */
        public static void main(String[] arg) throws IOException{
            OU o = new OU();
            DCET dcet = new DCET();
            MVSR mvsr =new MVSR();
            Abstract a =new Abstract();
            a.mainmenu(o,mvsr,dcet);
//            a.it(75600,1100);

        }

    }