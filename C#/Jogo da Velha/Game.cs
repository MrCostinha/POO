class Game {
    public string[,] cells;

    public Game() {
        cells = new string[3, 3];
        Initialize();
    }

    public void Initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int cell = (i+1)*10 + j+1;
                cells[i, j] = cell.ToString();
            }
        }
    }
    public void Play(string symbol) {
        Console.WriteLine("Posição do {0}: ", symbol);
        int cell;
        
        do {
            cell = int.Parse(Console.ReadLine()) - 11;

            Validate(cell);

            if (Validate(cell) == false) {
                Console.WriteLine("Posição inválida! Digite novamente: ");
                cell = int.Parse(Console.ReadLine()) - 11;
            }
        } while(Validate(cell) == false);

        Update(cell, symbol);
    }
    public void Show() {
        Console.WriteLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Console.Write(" " + cells[i, j] + " ");
                if (j < 2) {
                    Console.Write("|");
                }
            }
            Console.WriteLine();
            if (i < 2) {
                Console.WriteLine("-------------");
            }
        }
        Console.WriteLine();
    }
    public void Update(int cell, string symbol) {
        cells[cell/10, cell%10] = symbol;
    }
    public bool Validate(int cell) {
        int row = cell/10;
        int column = cell%10;

        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }
        if (cells[row, column] == "X" || cells[row, column] == "O") {
            return false;
        }

        return true;
    }
    public bool CheckWin(string symbol) {
        for (int i = 0; i < 3; i++) {
            if (cells[i, 0] == symbol && cells[i, 1] == symbol && cells[i, 2] == symbol) {
                return true;
            }
            if (cells[0, i] == symbol && cells[1, i] == symbol && cells[2, i] == symbol) {
                return true;
            }
        }
        
        if (cells[0, 0] == symbol && cells[1, 1] == symbol && cells[2, 2] == symbol) {
            return true;
        }
        if (cells[0, 2] == symbol && cells[1, 1] == symbol && cells[2, 0] == symbol) {
            return true;
        }

        return false;
    }
    public bool CheckStalemate(string x, string o) {
        int count = 0;
        foreach (string cell in cells) {
            if (cell == x || cell == o) {
                count++;
            }
        }
        if (count == 9) {
            return true;
        }

        return false;
    }
}