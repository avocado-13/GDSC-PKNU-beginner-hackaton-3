import { Link } from 'react-router-dom';
import React from 'react';
import './css/Nav.css'

function Nav() {
    return(
        <>
        <div className="nav-bar">
            <Link className="nav-bar-menu" to={'/Join'}>Join</Link>
            <Link className="nav-bar-menu" to={'/'}>Main</Link>
            <Link className="nav-bar-menu" to={'/Challenge'}>Challenge</Link>
            <Link className="nav-bar-menu" to={'/Diary'}>Diary</Link>
            <Link className="nav-bar-menu" to={'/Calendar'}>Calendar</Link>
        </div>
        </>
    )
}

export default Nav;