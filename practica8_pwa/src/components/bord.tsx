import Square from "./square"

interface BoardProps {
  squares: Array<string>;
  onGame: (actualIndex: number) => void;
}

const Board = ({ squares, onGame }: BoardProps) => {
  const winnerInfo = getWinnerInfo();

  const handleClick = (index: number) => {
    if (!winnerInfo && !squares[index]) {
      onGame(index);
    }
  };

  function getWinnerInfo(): { winner: string, line: number[] } | null {
    const lines = [
      [0, 1, 2],
      [3, 4, 5],
      [6, 7, 8],
      [0, 3, 6],
      [1, 4, 7],
      [2, 5, 8],
      [0, 4, 8],
      [2, 4, 6],
    ];
    for (let line of lines) {
      const [a, b, c] = line;
      if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
        return { winner: squares[a], line };
      }
    }
    return null;
  }

  const winner = winnerInfo?.winner;
  const winnerCells = winnerInfo?.line ?? [];

  return (
    <>
      {winner && <h2>🎉 ¡Ganó {winner.toUpperCase()}!</h2>}
      <div className="board">
        {squares.map((value, i) => (
          <Square
            key={i}
            value={value}
            handleClickSquare={() => handleClick(i)}
            highlight={winnerCells.includes(i)}
            disabled={!!winner}
          />
        ))}
      </div>
    </>
  );
};

export default Board;
