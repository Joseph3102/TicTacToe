public class Game {




    char currentPlayer = 'X';


    public static void main(String[] args) {





        Board board = new Board();


        board.printBoard();         

   


        board.checkWin(currentPlayer)

        
    }
}
