public class Queens {
    private class Space {
        boolean placeable;
        boolean occupied;

        public Space() {
            this.placeable = true;
            this.occupied = false;
        }

        public boolean isPlaceable() {
            return placeable;
        }

        public void setPlaceable(boolean placeable) {
            this.placeable = placeable;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
        }
    }
    Space[][] board;
    int height;
    int width;
    Space[][] found;

    public Queens(int height, int width) {
        this.height = height;
        this.width = width;
        board = new Space[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = new Space();
            }
        }
        found = board;
    }

    public void findAllPossible() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

            }
        }
    }

    public void placeQueen(int i, int j) {
        board[i][j].setOccupied(true);
        markDiagonals(i,j);
        markLines(i,j);
    }

    public void markDiagonals(int i, int j) {
        for (int k = i, l = j; (k < height) & (l < width); k++,l++) {
            board[k][l].setPlaceable(false);
        }
        for (int k = i, l = j; (k < height) & (l >= 0); k++,l--) {
            board[k][l].setPlaceable(false);
        }
        for (int k = i, l = j; (k >= 0) & (l >= 0); k--,l--) {
            board[k][l].setPlaceable(false);
        }
        for (int k = i, l = j; (k >= 0) & (l < width); k--,l++) {
            board[k][l].setPlaceable(false);
        }
    }
    public void markLines(int i, int j) {
        for (int k = 0; k < height; k++) {
            board[k][j].setPlaceable(false);
        }
        for (int k = 0; k < width; k++) {
            board[i][k].setPlaceable(false);
        }
    }
}
