// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Hello! Please tell me your name.");
String name = sc.nextLine();
System.out.println("Hello " + name + ", it is nice to meet you.");



    System.out.println("Welcome to the Music Ideas Generator! Please select a scene:\n"
                   + "1) home\n"
                   + "2) party\n"
                   + "3) concert\n"
                   + "and any other number for Other!");

int choice = sc.nextInt();
   
  switch(choice) {
    case 1: System.out.println("It's one of those days when you stay in!");
          break;
    case 2: System.out.println("Time to celebrate!");
          break;
    case 3: System.out.println("You finally get to see your idol!");
          break;
    default: System.out.println("You listen to music elsewhere!");
          break;
}
 //start of choice 1   
if (choice == 1) {
    System.out.println("\nPlease select a genre:\n"
                   + "1) EDM\n"
                   + "2) Pop\n"
                   + "3) Rap\n"
                   + "Any other number for Other!");

int genre = sc.nextInt();

    switch(genre) {
  case 1: System.out.println("Don't feel like going to a rave?");
          break;
  case 2: System.out.println("You know all the mainstream songs!");
          break;
  case 3: System.out.println("Let me hear your freestyle!");
          break;
  default: System.out.println("You want nothing?!");
          break;
}

      System.out.println("\nPlease select an artist:\n"
                   + "1) Illenium\n"
                   + "2) Ariana Grande\n"
                   + "3) Eminem\n"
                   + "Any other number for Other!");

int artist = sc.nextInt();

    switch(artist) {
  case 1: System.out.println("Have you heard his song 'Good Things Fall Apart' ? ");
          break;
  case 2: System.out.println("Do you know her song 'Quit'?");
          break;
  case 3: System.out.println("Listen to his song 'No Love'!");
          break;
  default: System.out.println("Try listening to 'Happier Than Ever' by Billie Eilish.");
          break;
}

//end of choice 1, start of choice 2
  
  
} else if (choice == 2) {

    System.out.println("\nPlease select a genre:\n"
                   + "1) EDM\n"
                   + "2) Pop\n"
                   + "3) Rap\n"
                   + "Any other number for Other!");

int genre = sc.nextInt();

    switch(genre) {
  case 1: System.out.println("Let's rave!");
          break;
  case 2: System.out.println("Sing along with your friends!");
          break;
  case 3: System.out.println("Time to break it down!");
          break;
  default: System.out.println("You want nothing?!");
          break;
}

      System.out.println("\nPlease select an artist:\n"
                   + "1) Excision\n"
                   + "2) Michael Jackson\n"
                   + "3) Lil Jon\n"
                   + "Any other number for Other!");

int artist = sc.nextInt();

    switch(artist) {
  case 1: System.out.println("Have you heard his song 'Feel Something' ? ");
          break;
  case 2: System.out.println("Play his song 'Beat It'!");
          break;
  case 3: System.out.println("Tell Alexa 'Turn Down For What'!");
          break;
  default: System.out.println("Try Listening to 'Drogba'");
          break;
}


  //end of choice 2, start of choice 3
  
} else if (choice == 3) {

System.out.println("\nPlease select a genre:\n"
                   + "1) EDM\n"
                   + "2) Pop\n"
                   + "3) Rap\n"
                   + "Any other number for Other!");

int genre = sc.nextInt();

    switch(genre) {
  case 1: System.out.println("Let's rave!");
          break;
  case 2: System.out.println("Sing along with your friends!");
          break;
  case 3: System.out.println("Time to break it down!");
          break;
  default: System.out.println("You want nothing?!");
          break;
}

      System.out.println("\nPlease select an artist:\n"
                   + "1) Odesza\n"
                   + "2) Taylor Swift\n"
                   + "3) Drake\n"
                   + "Any other number for Other!");

int artist = sc.nextInt();

    switch(artist) {
  case 1: System.out.println("Have you heard the song 'Say My Name' ? ");
          break;
  case 2: System.out.println("Play her song 'Anti-Hero'!");
          break;
  case 3: System.out.println("Sing along to 'Passionfruit'");
          break;
  default: System.out.println("Try Listening to 'La noche de anoche'");
          break;
}



  //end of choice 3, start of else

} else {
    System.out.println("You have unique taste!");
}

      sc.close(); 

//end of generator
 System.out.println("------------------------");


//creating a concert object, calling it c
  Concert c = new Concert();
  c.event(18);
  c.event(29, "Garth Brooks.");
  c.event(108, "one of ", 100);

  Concert concert = new Concert();
concert.fyi();


     Spotify spotify = new Spotify();
spotify.fyi();

//array

 System.out.println("------------------------");


    
int[] array = {1, 2, 3, 4, 5};
                        

     ArrayList<Person> protest = new ArrayList<>();

Protester kennedi = new Protester("Songwriter Kennedi Lykken");
Protester tiffany = new Protester("Tiffany Red");
Passerby rodney = new Passerby("Rodney Jerkins", "moderate");
Passerby kaydence = new Passerby("Kaydence Tice", "high");

       
    
 protest.add(kennedi);
    protest.add(tiffany);
    protest.add(rodney);
    protest.add(kaydence);

     for (Person person : protest) {
      person.walk();
    }

//getters and setters

 System.out.println("------------------------");



     Artist profile = new Artist();
    profile.setName("Dan Omelio");
    profile.setstageName("Robopop");
    profile.setpreviousWork("Maroon 5 and Lana Del Rey");
    profile.setage(38);

System.out.println(profile.getName());
    
    System.out.println("Protestor Profile");
      
    System.out.println("Artist Name: " + 
 profile.getName());

    System.out.println("Stage Name: " + 
 profile.getstageName());

  System.out.println("Previous Work: " + 
 profile.previousWork());

 System.out.println("Age: " +  profile.getage());

//combining concepts

    System.out.println("------------------------");

        ArrayList<Ruling> arrlistruling = new ArrayList<>(); 

      Defendant defendant = new Defendant ("Spotify", arrlistruling);

    defendant.setDamages("increase royalties for artists");
      System.out.println(defendant);

      Ruling ruling = new Ruling (44, "July 1 2022");

    arrlistruling.add(ruling);
     defendant.printDecision();

  System.out.println("------------------------");  
    
    int[] playlist = {1, 2, 3, 4, 5};


     try{
    getFifthElement(playlist);
  } catch (Exception ex) {
    System.out.println("caught!");
    ex.printStackTrace();
  }   
    


   
   }
public static void getFifthElement(int[] playlist) {
  System.out.println(playlist[5]);
     
} 

}
