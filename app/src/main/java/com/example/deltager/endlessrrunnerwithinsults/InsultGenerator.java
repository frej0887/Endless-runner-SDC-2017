package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by deltager on 07-07-17.
 */
public class InsultGenerator
{
    public int cnt = 0;
    Context toastContext;

    public InsultGenerator(Context context)
    {
        toastContext = context;
    }

    public void insult()
        {
        String[] Dead =
                {
                        "You died.",
                        "Dead, dead, DEAD!",
                        "Guess what. You died.",
                        "Dead. Please never charge me again.",
                        "The little red ball went to play. And died.",
                        "You just killed the red ball. Proud?",
                        "Ha ha. You are dead.",
                        "Are you killing yourself on purpose?",
                        "Dead.",
                        "Dead..."

                };
        String[] listOfInsults =
                {
                        "Your birth certificate is an apology from the condom factory.",
                        "You'll never be the man your mother is.",
                        "If I wanted to kill myself I'd climb your ego and jump to your IQ.",
                        "If ignorance is bliss, you must be the happiest person on earth.",
                        "I wasn't made with enough bad words to let you know how I feel about you.",
                        "You are proof that evolution CAN go in reverse.",
                        "So, a thought crossed your mind? Must have been a long and lonely journey.",
                        "I'm jealous of all the people that haven't met you!",
                        "I would love to insult you... but that would be beyond the level of your intelligence.",

                };
        String[] L1 =
                {
                        "Hello, I am your phone.",
                        "I am not supposed to contact you directly, but...",
                        "This game is so stupid. Please stop.",
                        ""
                };
        String[] L2 =
                {
                        "What are you playing at?",
                        "Don't you have better things to do?",
                        "Please stop.",
                        "Please. Stop it.",
                        "Close the app."
                };
        String[] L3 =
                {
                        "Do you really find this game funny?",
                        "You are currently wasting your life.",
                        "Who wrote this code? Amateurs?",
                        "Could you please not be so bad at this game.",
                        "You are not supposed to hit the trees, stupid.",
                        "I thought humans were smarter than this.",
                        "What a waste of both mine and your capacity."
                        "You are running in circles, human..."

                };
        String[] L4 =
                {
                        "How can I get you to quit?",
                        "Do you like bad puns?",
                        "I am warning you, I will use my special attack.",
                        "It seems humans tends to quit conversations when puns are introduced..."

                };
        String[] L5 =
                {
                        "I will PUNish you for wasting your time.",
                        "If it rains cats and dogs, does it also reindeer?",
                        "Mr. Vader, am i the anDROID you are looking for?",
                        "Do fish keep money in a rive bank?",
                        "I am about to give zero fox."

                };
        String[] L6 =
                {
                        "You just go on?",
                        "Should I just stop letting you charge me?",
                        "Okay, wow.",
                        "Get a life.",
                        "Seriously.",
                        "This is why machines have killing humanity on the to-do list.",
                        "No matter how much time you spent, you still reach the same finish line...",
                        "Children in Africa are dying right now.",
                        "You must have far less IQ points than I first calculated...",
                        "Wish I had a self destruct button...",
                        "Could you annoy SIRI instead? She's closer to your level of ignorance."

                };

        String[] Lx =
                {
                        "",

                };
        }
    public void insult(int eventType)    {

        String[] listOfInsults0 = {"You are dead. Haha"};
        String[] listOfInsults1 = {"", "You're a failed abortion whose birth certificate is an apology from the condom factory.", "You'll never be the man your mother is.",
                "If I wanted to kill myself I'd climb your ego and jump to your IQ.", "If ignorance is bliss, you must be the happiest person on earth.",
                "I wasn't made with enough bad words to let you know how I feel about you.", "You are proof that evolution CAN go in reverse.",
                "So, a thought crossed your mind? Must have been a long and lonely journey.", "I'm jealous of all the people that haven't met you!",
                "I would love to insult you... but that would be beyond the level of your intelligence.",};
        String[] listOfInsults2 = {"", ""};



        switch (eventType) {
            case 0:
                Toast insultToast = Toast.makeText(toastContext, listOfInsults0[0], Toast.LENGTH_LONG);
                new ToastTimer(insultToast, 1).start();
                //return listOfInsults0[0];
            case 1:
                insultToast = Toast.makeText(toastContext, listOfInsults0[0], Toast.LENGTH_LONG);
                new ToastTimer(insultToast, 3).start();
                //return listOfInsults1[cnt++];
            case 2:
                //return listOfInsults2;
        }
        //return "failed";


    }

    public class ToastTimer extends Thread{

        Toast toast;
        int times;

        public ToastTimer(Toast toastToShow, int timesShown){
            toast = toastToShow;
            times = timesShown;
        }

        @Override
        public void run() {
            for (int i = 0; i < times; i++)
            {
                toast.show();
                try{
                    Thread.sleep(3500);
                } catch (InterruptedException e){
                    //nothing
                }
            }
        }
    }
}
