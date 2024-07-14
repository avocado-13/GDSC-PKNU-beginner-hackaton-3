
//import React, { useState, useEffect } from 'react';
import Progress from './Progress';

import './css/Main.css';

function Main() {

    const progress = 70;
    /*
    const [progress, setProgress] = useState(0);
      // 백엔드에서 진행률 데이터를 가져오는 함수
  const fetchProgress = async () => {
    try {
      const response = await fetch('http://localhost:3000/progress');
      const data = await response.json();
      setProgress(data.progress);
    } catch (error) {
      console.error('Error fetching progress:', error);
    }
  };


  // 주기적으로 fetchProgress 함수를 호출하여 진행률을 업데이트합니다.
  useEffect(() => {
    const interval = setInterval(() => {
      fetchProgress();
    }, 2000); // 2초마다 진행률 업데이트

    return () => clearInterval(interval);
  }, []);
    */

    return (
        <>
            <div className="A">        
                <div className="current-challenge">
                    <p className="current-challenge-name">현재 참여 중인 챌린지 A</p>
                </div>
                <div>
                    <Progress progress={progress} />
                    <p className="progress-percentage">{progress}%</p>
                </div>
            </div>
            <div className="B">        
                <div className="current-challenge">
                    <p className="current-challenge-name">현재 참여 중인 챌린지 B</p>
                </div>
                <div>
                    <Progress progress={progress} />
                    <p className="progress-percentage">{progress}%</p>
                </div>
            </div>
        </>
    );
}

export default Main;
