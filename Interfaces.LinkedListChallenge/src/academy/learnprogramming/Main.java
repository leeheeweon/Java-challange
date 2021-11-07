package academy.learnprogramming;

import java.util.*;

public class Main {

    private static List<Albam> albams = new ArrayList<Albam>();

    public static void main(String[] args) {
        // write your code here
        Albam albam = new Albam("Stormbringer", "Deep Puple");
        albam.addSong("Stormbringer", 4.6);
        albam.addSong("Love don't mean a thing", 4.22);
        albam.addSong("Holy man", 4.3);
        albam.addSong("Holy on", 5.6);
        albam.addSong("Lady double dealer", 3.21);
        albam.addSong("You can't do it right", 6.23);
        albam.addSong("High ball shooter", 4.27);
        albam.addSong("The gypsy", 4.2);
        albam.addSong("Soldier of fortune", 3.13);
        albams.add(albam);

        albam = new Albam("For those about to rock", "AC/DC");
        albam.addSong("For those about to rock", 5.44);
        albam.addSong("I put the finger on you", 3.25);
        albam.addSong("Lets go", 3.45);
        albam.addSong("Inject the venom", 3.33);
        albam.addSong("Snowballed", 4.51);
        albam.addSong("Evil walks", 3.45);
        albam.addSong("C.O.D", 5.25);
        albam.addSong("Breaking the rules", 5.32);
        albam.addSong("Night of the long knives", 5.12);
        albams.add(albam);

        List<Song> playList = new ArrayList<Song>();
        albams.get(0).addToPlayList("You can't do it right", playList);
        albams.get(0).addToPlayList("Holy man", playList);
        albams.get(0).addToPlayList("Speed king", playList); //Does not exist
        albams.get(0).addToPlayList(9, playList);
        albams.get(1).addToPlayList(8, playList);
        albams.get(1).addToPlayList(3, playList);
        albams.get(1).addToPlayList(2, playList);
        albams.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);
    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playList");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playng " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    } else {
                        System.out.println("There are no songs that can be deleted.");
                    }

                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist.");
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.listIterator();
        System.out.println("==================================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        System.out.println("==================================");
    }
}
