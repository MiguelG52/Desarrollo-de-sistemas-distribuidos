

interface ScoreBoardProps{
    user:string
}

const ScoreBoard = ({ user }: ScoreBoardProps) => {
  return (
    <div style={{ fontSize: '1.2rem', fontWeight: 'bold' }}>
      Turno de: <span style={{ color: 'oklch(50% 0.2 256)' }}>{user.toUpperCase()}</span>
    </div>
  );
};

export default ScoreBoard