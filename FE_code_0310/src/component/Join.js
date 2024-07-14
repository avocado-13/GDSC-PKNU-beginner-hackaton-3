import React, { useState } from "react";
import './css/Join.css';

function Join(props) {
    const [name, setName] = useState("이름");
    const [email, setEmail] = useState("이메일");
    const [age, setAge] = useState("나이");

    const [job, setJob] = useState('');

    const handleChangeName = (event1) => {
      setName(event1.target.value);
      console.log("Name = " + event1.target.value);
    };
    const handleChangeEmail = (event2) => {
      setEmail(event2.target.value);
      console.log("Email = " + event2.target.value);
    };
    const handleChangeAge = (event3) => {
      setAge(event3.target.value);
      console.log("Age = " + event3.target.value);
    }
    
    const handleClick = (selectJob) => {
      console.log("selected Job = " + selectJob);
      setJob(selectJob);
    };
    
    const handleSubmit = (event) => {};

    return (
      <>
        <input className="name" value={name} onChange={handleChangeName} style={{marginTop: "50px"}}/><br/>
        <input className="email" value={email} onChange={handleChangeEmail}/><br/>
        <input className="age" value={age} onChange={handleChangeAge}/><br/>
        
        <button className="button" value={job} onClick={()=>handleClick("회사원")}>회사원</button>
        <button className="button" value={job} onClick={()=>handleClick("학생")}>학생</button>
        <button className="button" value={job} onClick={()=>handleClick("서비스업 종사자")}>서비스업 종사자</button>
        <button className="button" value={job} onClick={()=>handleClick("무직")}>무직</button>
        <br/><br/>

        <button type="submit" onClick={handleSubmit}>Submit</button>

      </>
    );
}

export default Join;