import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import './css/Calendar.css';

function Calendar() {
  const [selectedDate, setSelectedDate] = useState(null);
  const [diary, setDiary] = useState('');
  const [diarys, setDiarys] = useState({});

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

  return (
    <div>
      <DatePicker 
        className="date-picker"
        selected={selectedDate}
        onChange={handleDateChange}
        dateFormat="yyyy/MM/dd"
        isClearable
        placeholderText="Calendar 보기"
      />
      {selectedDate && (
        <div>
          <input
            type="text"
            value={diary}
            onChange={handlediaryChange}
            placeholder="오늘의 일기 작성하기"
          />
          <button onClick={savediary}>Save diary</button>
        </div>
      )}
        {Object.entries(diarys).map(([date, diary]) => (
          <p key={date}>{date}: {diary}</p>
        ))}
    </div>
  );
}

export default Calendar;
