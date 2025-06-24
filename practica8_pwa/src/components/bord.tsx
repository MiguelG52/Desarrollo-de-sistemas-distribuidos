
import Square from "./square"


interface BoardProps {
  squares: Array<string>
  onGame: (actualIndex:number) => void
}

const Board = ({squares, onGame}:BoardProps) => {  
  

  const onclickSquare = (index:number)=>{
    onGame(index)
    const winner = validateWinner()
    if(winner){
      alert(`El ganador es: ${winner}`)
    }
  }

  const validateWinner = ()=>{
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
    for (let i = 0; i < lines.length; i++) {
      const [a, b, c] = lines[i];
      if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
        return squares[a];
      }
    }
    return null;
  }

  return (
    <>
      
      <div className="board">
        <Square value={squares[0]} handleClickSquare={()=>onclickSquare(0)}/>
        <Square value={squares[1]} handleClickSquare={()=>onclickSquare(1)}/>
        <Square value={squares[2]} handleClickSquare={()=>onclickSquare(2)}/>
        <Square value={squares[3]} handleClickSquare={()=>onclickSquare(3)}/>
        <Square value={squares[4]} handleClickSquare={()=>onclickSquare(4)}/>
        <Square value={squares[5]} handleClickSquare={()=>onclickSquare(5)}/>
        <Square value={squares[6]} handleClickSquare={()=>onclickSquare(6)}/>
        <Square value={squares[7]} handleClickSquare={()=>onclickSquare(7)}/>
        <Square value={squares[8]} handleClickSquare={()=>onclickSquare(8)}/>
      
      </div>
    </>
  )
}

export default Board