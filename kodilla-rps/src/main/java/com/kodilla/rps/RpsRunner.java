package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        System.out.println("Witamy w w grze, papier, kamień, nożyce, jaszczurka, Spock");
        System.out.println("Podaj swoje imie");
        Scanner keyboardName = new Scanner(System.in);
        String playerName = keyboardName.next();

        System.out.println("Podaj liczbę wygranych potrzebnych do osiągnięcia zwycięstwa");
        Scanner keyboardWin = new Scanner(System.in);
        int win = 0;
        int result = 0;
        int playerScore = 0;
        int computerScore = 0;
        boolean end = false;
        boolean repeat = false;
        int cheat = 0;

        try
        {
            win = keyboardWin.nextInt();
        }catch (InputMismatchException i)
        {
            win = 3;
            System.out.println("Nie podano liczby. Ilość wygranych potrzebych do zwycięstwa = 3");
        }

        int lost = win * (-1);
        System.out.println("Obsługa gry");
        while (!end)
        {

            System.out.println("Aby zagrać kamień wciśnij 1");
            System.out.println("Aby zagrać papier wciśnij 2");
            System.out.println("Aby zagrać nożyce wciśnij 3");
            System.out.println("Aby zagrać jaszczurka wciśnij 4");
            System.out.println("Aby zagrać Spock wciśnij 5");
            System.out.println("Aby zakończyć grę wciśnij 0");

            int choice = 10;
            Scanner keyboardChoice = new Scanner(System.in);

            try
            {
                choice = keyboardWin.nextInt();
            }catch (InputMismatchException i)
            {
                choice = 10;
                System.out.println("Wybierz jeszcze raz");
            }

            if (choice == 0)
            {
                System.out.println("Aby zakończyć grę ponownie wciśnij 0");
                Scanner keyboardChoice2 = new Scanner(System.in);
                int choice2 = keyboardChoice2.nextInt();
                if (choice2 == 0)
                {
                    System.out.println("Dziękujemy za grę");
                    repeat = true;
                }
            }

            Random cheater = new Random();
            cheat = cheater.nextInt(5)+1;
            int cheatQuantity = 0;

            if ((result == win)||(result == lost))
            {

                repeat = true;
                if (result == win) {
                    System.out.println("Z W Y C I E S T W O");
                }
                else
                {
                    System.out.println("Tym razem się nie udało. Komputer wygrywa.");
                    System.out.println("Spróbuj ponownie");
                }

            }
            else
            {
                //KOD GRY
                int computerPlayer = 0;
                Random rand = new Random();
                computerPlayer = rand.nextInt(6)+1;

                if ((choice == 1)&&(cheat == cheatQuantity)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("Kamień niszczy nożyce. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                    cheatQuantity = 0;
                }

                if ((choice == 2)&&(cheat == cheatQuantity)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("papier udowadnia błąd Spocka. Wygrywa " +playerName);
                    cheatQuantity = 0;
                }

                if ((choice == 3)&&(cheat == cheatQuantity)) {
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("Nożyce ranią jaszczurkę.  Wygrywa " +playerName);
                    result++;
                    playerScore++;
                    cheatQuantity = 0;
                }

                if ((choice == 4)&&(cheat == cheatQuantity)) {
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("Jaszczurka zjada papier. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                    cheatQuantity = 0;
                }

                if ((choice == 5)&&(cheat == cheatQuantity)) {
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("Spock kruszy kamień. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                    cheatQuantity = 0;
                }

                if ((choice == 1)&&(computerPlayer == 1)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("REMIS");
                }
                if ((choice == 1)&&(computerPlayer == 2)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("Papier owija kamień. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 1)&&(computerPlayer == 3)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("Kamień niszczy nożyce. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 1)&&(computerPlayer == 4)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("Kamień zgniata jaszczurkę. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 1)&&(computerPlayer == 5)) {
                    System.out.println(playerName + " wybiera kamień");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("Spock kruszy kamień. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }

                if ((choice == 2)&&(computerPlayer == 1)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("papier owija kamień. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 2)&&(computerPlayer == 2)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("REMIS");
                }
                if ((choice == 2)&&(computerPlayer == 3)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("Nożyce tną papier. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 2)&&(computerPlayer == 4)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("Jaszczurka zjada papier.  Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 2)&&(computerPlayer == 5)) {
                    System.out.println(playerName + " wybiera papier");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("papier udowadnia błąd Spocka. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }

                if ((choice == 3)&&(computerPlayer == 1)) {
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("Kamień niszczy nożyce. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 3)&&(computerPlayer == 2)) {
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("Nożyce tną papier. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 3)&&(computerPlayer == 3)) {
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("REMIS");
                }
                if ((choice == 3)&&(computerPlayer == 4)){
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("Nożyce ranią jaszczurkę.  Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 3)&&(computerPlayer == 5)) {
                    System.out.println(playerName + " wybiera nożyce");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("Spock łamie nożyce. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }

                if ((choice == 4)&&(computerPlayer == 1)) {
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("Kamień zgniata jaszczurkę. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 4)&&(computerPlayer == 2)) {
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("Jaszczurka zjada papier. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 4)&&(computerPlayer == 3)) {
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("Nożyce ranią jaszczurkę. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 4)&&(computerPlayer == 4)){
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("REMIS");
                }
                if ((choice == 4)&&(computerPlayer == 5)) {
                    System.out.println(playerName + " wybiera jaszczurkę");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("Jaszczurka zatruwa Spocka. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }

                if ((choice == 5)&&(computerPlayer == 1)) {
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera kamień");
                    System.out.println("Spock kruszy kamień. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 5)&&(computerPlayer == 2)) {
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera papier");
                    System.out.println("Papier udowadnia błąd Spocka. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 5)&&(computerPlayer == 3)) {
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera nożyce");
                    System.out.println("Spock łamie nożyce. Wygrywa " +playerName);
                    result++;
                    playerScore++;
                }
                if ((choice == 5)&&(computerPlayer == 4)){
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera jaszczurkę");
                    System.out.println("Jaszczurka zatruwa Spocka. Wygrywa komputer");
                    result--;
                    computerScore++;
                    cheatQuantity++;
                }
                if ((choice == 5)&&(computerPlayer == 5)) {
                    System.out.println(playerName + " wybiera Spocka");
                    System.out.println("Komputer wybiera Spocka");
                    System.out.println("REMIS");
                }
            }

            if (repeat == true)
            {
                System.out.println("Jeżeli chcesz powtórzyć grę wciśnij 1");

                Scanner keyboardRepeat = new Scanner(System.in);
                int repeatTest = 0;
                try {
                    repeatTest = keyboardRepeat.nextInt();
                }catch (InputMismatchException i)
                {
                    repeat = false;
                    end = true;
                }
                if (repeatTest == 1)
                {
                    repeat = false;
                    playerScore = 0;
                    computerScore = 0;
                }
                else
                {
                    System.out.println("Koniec gry");
                    repeat = false;
                    end = true;
                }

            }
            System.out.println("Aktualny wynik");
            System.out.println("Ilość zwycięstw gracza " +playerName +" wynosi " +playerScore);
            System.out.println("Ilość zwycięstw gracza komputerowego wynosi " +computerScore);
        }
    }
}
