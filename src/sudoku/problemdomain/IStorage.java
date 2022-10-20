package sudoku.problemdomain;

import java.io.IOException;

//Interfaces are great for keeping concerns for the back and front ends separate.
public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}