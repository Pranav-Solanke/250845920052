import React, { useState, useEffect, useCallback } from 'react';
//write code for random password generator  as per discuss in Lecture depends on length need to change 
function PasswordGenerator() {
  const [length, setLength] = useState(8); // Default length
  const [password, setPassword] = useState('');
  const[includeNumbers, setIncludeNumbers] = useState(false);
  const[includeSymbols, setIncludeSymbols] = useState(false); 

  const generatePassword = () => {
    let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
   if(includeNumbers) characters += '0123456789';
     if(includeSymbols) characters += '!@#$%^&*()_+';

    let newPassword = '';
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * characters.length);
      newPassword += characters[randomIndex];
    }
    setPassword(newPassword);
  };

useEffect(()=>{generatePassword()},
[length, includeNumbers, includeSymbols]
)
 useCallback(() => { generatePassword() },
    [length, includeNumbers, includeSymbols])

const copyToClipboard = () => {
    navigator.clipboard.writeText(password);
    alert('Password copied to clipboard!');
  };
  return (
    <div>
      <h2>Random Password Generator</h2>

      <label>
        Password Length:
        <input
          type="number"
          min="4"
          max="32"
          value={length}
          onChange={(e) => setLength(Number(e.target.value))}
        
        />
       
      </label>
      <br />
       <div>
      <label>
        <input type="checkbox" 
        checked={includeNumbers}
         onChange={()=>setIncludeNumbers(!includeNumbers)}/>
      Include Numbers
      </label>
      </div>
      <br />
      <div>
        <label>
        <input type="checkbox" checked={includeSymbols} 
        onChange={() => setIncludeSymbols(!includeSymbols)}></input>
      Include Symbols
      </label>
</div>
      <br />
      <button onClick={generatePassword}>Generate Password</button>

      {password && (
        <div>
          {/* <strong>Generated Password:</strong> */}
          <p>{password}</p>
        </div>
      )}

       <button onClick={copyToClipboard}>Copy</button>
    </div>
  );
}

export default PasswordGenerator;
