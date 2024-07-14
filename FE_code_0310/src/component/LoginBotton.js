import React from 'react';
import './LoginButton.scss';

const LoginButton = ({ type, placeholder, value, name, onChange }) => {
  return (
    <input
      className="LoginButton"
      type={type}
      placeholder={placeholder}
      onChange={onChange}
      value={value}
      name={name}
    />
  );
};

export default LoginButton;