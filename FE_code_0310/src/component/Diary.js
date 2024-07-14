import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';

import './css/Diary.css'

function Diary() {
    
  const [selectedDate, setSelectedDate] = useState(null);
  const [diary, setDiary] = useState('');
  const [diarys, setDiarys] = useState({});

  const [mood, setMood] = useState('');
  
  const handleDateChange = (date) => {
    setSelectedDate(date);
    if (date) {
      const dateString = date.toDateString();
      setDiary(diarys[dateString] || '');
    } else {
      setDiary('');
    }
  };
  const handlediaryChange = (event) => {
    setDiary(event.target.value);
    console.log("diary = " + event.target.value);
  };

  const savediary = () => {
    if (selectedDate) {
      const dateString = selectedDate.toDateString();
      setDiarys({ ...diarys, [dateString]: diary });
      setDiary('');
      setSelectedDate(null);
      console.log("Date = " + dateString);
    }
  };
  const handleClick = (selectMood) => {
    console.log("selected Mood = " + selectMood);
    setMood(selectMood);
  };
  return(
    <>
        <div className="diary-input-box">
            <DatePicker
                className="date-picker"
                selected={selectedDate}
                onChange={handleDateChange}
                dateFormat="yyyy/MM/dd"
                isClearable
                placeholderText="Calendar 보기"
            /> 

        <h3 className="diary-page-title">기분 선택</h3>
        <button className="button" onClick={()=>handleClick("기쁨")}>기쁨</button>
        <button className="button" onClick={()=>handleClick("슬픔")}>슬픔</button>
        <button className="button" onClick={()=>handleClick("분노")}>분노</button>
        <button className="button" onClick={()=>handleClick("소심")}>소심</button>
        <button className="button" onClick={()=>handleClick("지루")}>지루</button>
        <br/>
        {selectedDate && (
            <div>
            <textarea
                className="input-box"
                type="text"
                value={diary}
                onChange={handlediaryChange}
                placeholder="오늘의 일기 작성하기"
            />
            <button onClick={savediary}>저장하기</button>
            </div>
        )}
        {/*<p>{mood}를 선택하셨습니다.</p>*/}
      </div>
      {Object.entries(diarys).map(([date, diary]) => (
        <div className="diary" key={date}>
            <b>[{date}]</b>
            <br/>기분 : {mood}
            <br/>{diary}
        </div>
      ))}
    </>
  )
}

export default Diary;