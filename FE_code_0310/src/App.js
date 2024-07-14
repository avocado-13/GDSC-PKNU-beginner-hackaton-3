
import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
// import { useState, useEffect } from 'react';
import Title from './component/Title';

import Nav from './component/Nav';
import Join from './component/Join';
import Main from './component/Main';
import Challenge from './component/Challenge';
import Diary from './component/Diary';
import Calendar from './component/Calendar';
import ProgressBar from './component/Progress'


function App() {
  /*
  const [progress, setProgress] = useState(0);
  // Progress Bar 값
  useEffect(() => {
    const interval = setInterval(() => {
      setProgress(prevProgress => 
        prevProgress < 100 ? prevProgress + 1 : 100
      );
    }, 1000);

    return () => clearInterval(interval);
  }, []);
  */
  return (
    <BrowserRouter>
      <div className="App">
        <Title/>
        <Nav/>
        <ProgressBar/>
        <Routes>
          <Route path="/Join" element={<Join/>}/>
          <Route path="/" element={<Main/>}/>
          <Route path="/Challenge" element={<Challenge/>}/>
          <Route path="/Diary" element={<Diary/>}/>
          <Route path="/Calendar" element={<Calendar/>}/>
        </Routes>
      {/*
      <h1>Progress Bar Example</h1>
      <ProgressBar progress={progress} />
      <p>{progress}%</p>
      */}
      </div>
    </BrowserRouter>
  );
}

export default App;
