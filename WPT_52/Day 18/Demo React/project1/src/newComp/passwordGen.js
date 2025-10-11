import React, { useState } from 'react';
//write code for random password generator  as per discuss in Lecture depends on length need to change 
function PasswordGenerator() {
  const [length, setLength] = useState(8); // Default length
  const [password, setPassword] = useState('');

  const generatePassword = () => {
    const charset = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+';
    let newPassword = '';
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * charset.length);
      newPassword += charset[randomIndex];
    }
    setPassword(newPassword);
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h2>Random Password Generator</h2>

      <label>
        Password Length:
        <input
          type="number"
          min="4"
          max="32"
          value={length}
          onChange={(e) => setLength(Number(e.target.value))}
          style={{ marginLeft: '10px', width: '60px' }}
        />
      </label>

      <br /><br />
      <button onClick={generatePassword}>Generate Password</button>

      {password && (
        <div style={{ marginTop: '20px' }}>
          <strong>Generated Password:</strong>
          <p style={{ fontSize: '18px', color: 'green' }}>{password}</p>
        </div>
      )}
    </div>
  );
}

export default PasswordGenerator;
