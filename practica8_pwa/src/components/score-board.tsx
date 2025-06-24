

interface ScoreBoardProps{
    user:string
}

const ScoreBoard = ({user}:ScoreBoardProps) => {
  return (
    <>
        <p>Turno de usuario:<span>{user}</span></p>
    </>
  )
}

export default ScoreBoard