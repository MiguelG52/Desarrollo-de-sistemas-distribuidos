
interface squareProps {
  value: string;
  handleClickSquare: () => void;
  disabled?: boolean;
  highlight?: boolean;
}

const Square = ({ value, handleClickSquare, disabled = false, highlight = false }: squareProps) => {
  return (
    <button
      className={`cell ${highlight ? "cell-highlight" : ""}`}
      onClick={handleClickSquare}
      disabled={disabled || !!value}
    >
      {value}
    </button>
  );
};

export default Square;
