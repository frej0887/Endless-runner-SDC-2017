package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by deltager on 07-07-17.
 */
public class InsultGenerator {

    Context toastContext;

    public InsultGenerator(Context context) {
            toastContext = context;
        }

    public void insult()
    {
    int cnt = 0;


        String[] listOfInsults =
                {
                "You're a failed abortion whose birth certificate is an apology from the condom factory.", "You'll never be the man your mother is.",
                "If I wanted to kill myself I'd climb your ego and jump to your IQ.", "If ignorance is bliss, you must be the happiest person on earth.",
                "I wasn't made with enough bad words to let you know how I feel about you.", "You are proof that evolution CAN go in reverse.",
                "So, a thought crossed your mind? Must have been a long and lonely journey."
                };


        makeToast(listOfInsults[cnt]);
        cnt++;
    }
    public void makeToast(String theInsult)
    {

    Toast toastInsult = Toast.makeText(toastContext, theInsult, Toast.LENGTH_LONG);
    toastInsult.show();

    }
}
