import { useState } from 'react'
import './App.css'
import Board from './components/bord'
import ScoreBoard from './components/score-board'

function App() {
  
  const [currentUser,setCurrentUser] = useState<string>("x");
  const handleClickChangeCurrentUser = ()=> setCurrentUser(currentUser==="x"?"o":"x");
  const [squares, setSquares] = useState<string[]>(Array(9).fill(""));

  const handleGame = (actualIndex:number) =>{
    if (squares[actualIndex]) return;

    const newSquares = [...squares];
    newSquares[actualIndex] = currentUser;
    setSquares(newSquares);
    handleClickChangeCurrentUser()
  }
  const handleRestartMatch = ()=>{
    setSquares(Array(9).fill(""))
  }


  return (
    <>
      <div className='main'>
        <div className='header'>
          <ScoreBoard user={currentUser}/>
          <button onClick={handleRestartMatch}>Reiniciar</button>
        </div>
        <Board squares={squares} onGame={handleGame}/>
      </div>  
    </>
  )
}

export default App
