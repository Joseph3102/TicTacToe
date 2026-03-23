public class Board {

    private char[][] board;

    public Board() {

    board = new char[3][3];



    for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
    }

    public void printBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        public boolean checkWin(char player) {

            for (int col = 0; col < 3; col++){
                if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                    return true;
                }
            }

            for (int row = 0; row < 3; row++){
                if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
                    return true;
                }
            }

            if (board[0][0] == player && board[1][1] == player && board[2][2] == player || board[0][2] == player && board[1][1] == player && board[2][0] == player){
                return true;
            }


            return false;



        }



        public boolean checkDraw(){
            
            return false;
        }


}