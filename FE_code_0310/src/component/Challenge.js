import { Link } from 'react-router-dom';
import './css/Challenge.css'

function Challenge() {
    return (
    <>
        <b><nav className="challenge-menu">
            <div className="challenge"><Link to="/Challenge1">Challenge1</Link></div>
            <div className="challenge"><Link to="/Challenge2">Challenge2</Link></div>
            <div className="challenge"><Link to="/Challenge3">Challenge3</Link></div>
            <div className="challenge"><Link to="/Challenge4">Challenge4</Link></div>
        </nav></b>
    </>
    );
}

export default Challenge;