package GameElements;

public class HangmanASCII {

    public static void drawHangman(int livesLost, int startingLives) {
        System.out.println("Hangman status: ");

        //Draw hangman based on number of lives lost
        if (startingLives == 12) {
            switch (livesLost) {
                case 1:
                    System.out.println("_____");
                    break;
                case 2:
                    System.out.println("___________");
                    break;
                case 3:
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("___|_______");
                    break;
                case 4:
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("___|_______");
                    break;
                case 5:
                    System.out.println("   _____   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 6:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 7:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 8:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |   |   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 9:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 10:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  /    ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 11:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  / \\ ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 12:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (x_x) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  / \\ ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                default:
                    System.out.println("No noose yet.");
                    break;
            }
        }
        else if (startingLives == 8) {
            switch (livesLost) {
                case 1:
                    System.out.println("___________");
                    break;
                case 2:
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("___|_______");
                    break;
                case 3:
                    System.out.println("   _____   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 4:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 5:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 6:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 7:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  / \\ ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 8:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (x_x) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  / \\ ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                default:
                    System.out.println("No noose yet.");
                    break;
            }
        }
        else {
            switch (livesLost) {
                case 1:
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("   |      ");
                    System.out.println("___|_______");
                    break;

                case 2:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 3:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (o_o) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |       ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                case 4:
                    System.out.println("   _____   ");
                    System.out.println("   |   |   ");
                    System.out.println("   | (x_x) ");
                    System.out.println("   |  /|\\ ");
                    System.out.println("   |  / \\ ");
                    System.out.println("   |       ");
                    System.out.println("___|_______");
                    break;
                default:
                    System.out.println("No noose yet.");
                    break;
            }
        }

    }
}
