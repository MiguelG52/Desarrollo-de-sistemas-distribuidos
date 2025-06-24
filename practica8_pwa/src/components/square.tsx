
interface squareProps{
  value:string,
  handleClickSquare: () => void
}

const Square = ({value, handleClickSquare}:squareProps) => {
  return (
    <>
        <button className="cell" onClick={handleClickSquare} value={value}>
          {value}
        </button>
    </>
  )
}

export default Square