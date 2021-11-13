#canLEAD

//updated version that compiles; it was bothering me that it wouldn't compile so I fixed the problem, which was that 
//my filename was wrong! This file should compile for you, I'm sorry for any awkwardness from the zoom call.
//you will have to change the name to HelloWorld.java, though, because I already used .java on my first submission

package helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String args[]) {
        //import a scanner; this is Java's way of reading input
        Scanner Input=new Scanner(System.in);
        
        //opening prompts and story beginning
        System.out.println("~~~~You are standing in a dark courtyard of trees. Someone approaches, their face in shadow.~~~~");
        System.out.println("Unknown: Hello Traveller!\n");
        
        //Initialize variable to hold user input
        char userChoice='0';
        
        //loop to ensure user selection is correct
        do {
            System.out.println("How do you respond?");
            System.out.println("1. Hello Stranger! \n2. Who are you? \n3. Where am I?");
            userChoice=Input.next().charAt(0); //receive input from user about their decision
          
        } while (userChoice!='1'  && userChoice!='2' && userChoice!='3');
        prompt(1,userChoice); //call prompt method to display appropriate response

        System.out.println("You: Dlrow, huh? Let's take a look around."); 
        System.out.println("Guide: Let us first go to the Cliffs of Beyond.");
        
        //loop to ensure user selection is correct
        do {
            System.out.println("How do you respond?");
            System.out.println("1. Ok, sure! \n2. I want to go home :(");
            userChoice=Input.next().charAt(0); //receive input from user about their decision
          
        } while (userChoice!='1'  && userChoice!='2');
        prompt(2,userChoice); //call prompt method to display appropriate response
        
        //literally just prompts
        System.out.println("You go with your guide through the trees. It is an arduous"
                + " journey, and sometimes you wish you hadn't agreed to go with "
                + "your guide.");
        System.out.println("Guide: Aha! here we are! Welcome to the Cliffs of the Beyond!");
        System.out.println("~~~~You push through thick brush until you come to stand beside your"
                + " guide in the fading light of sunset.~~~~");
        System.out.println("~~~~You are on a bluff, overlooking rolling hills of brilliant green,"
                + " dotted here and there with small houses in the shape of letters, spelling out Dlrow.~~~~");
        System.out.println("But it isn't the hills or the houses that amaze you, it is the brilliant sky;"
                + " Instead of sunsets at home, this one is a brilliant mirror of the valley below.");
        System.out.println("You: Wow! Hello World.");
    }
    
    //This method takes in the question number and user selection, and prints the 
    //appropriate response. I just didn't want the switches clogging up my main program
    static void prompt(int question, char userChoice) {
        switch (question) {
            case 1: {
                switch(userChoice) {
                    case '1': {
                        System.out.println("You: Hello Stranger!");
                        System.out.println("Unknown: Welcome to Dlrow, Traveller. "
                                + "Let me guide you through its mysteries.");

                    } break;
                    case '2': {
                        System.out.println("You: Who are you?");
                        System.out.println("Unknown: You can call me your guide to this "
                                + "universe; the one called Dlrow.");
                    } break;
                    case '3': {
                        System.out.println("You: Where am I?");
                        System.out.println("Unknown: You are in Dlrow nw, weary traveller. "
                                + "Welcome! I will show you its mysteries and be your guide.");
                    } break;
                    default: {
                        //will never occur, it's just good practice to have one
                    } break;    
                }
                return;  
            } 
            case 2: {
                switch(userChoice) {
                    case '1': {
                        System.out.println("You: Ok, sure!");
                    } break;
                    case '2': {
                        System.out.println("You: I want to go home :(");
                        System.out.println("Unknown: To get home, we must travel to the portal to your homeland. "
                                + "We must prepare for the journey.");
                    } break;
                    default: {
                        //will never occur, it's just good practice to have one
                    } break;    
                }
                return;
            }
        }       
    }
}
