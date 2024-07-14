import React from 'react';
import './css/Progress.css'

function Progress({ progress }) {
  return (
    <div className="progress-bar">
      <div 
        className="progress-bar-fill" 
        style={{ width: `${progress}%` }}>
      </div>
    </div>
  );
}

export default Progress;