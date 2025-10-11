// import { useState, useEffect } from 'react';

// export default function Timer() {
//   const [count, setCount] = useState(0);

//   useEffect(() => {
//     const timer = setTimeout(() => {
//       setCount((prevCount) => prevCount + 1);
//     }, 5000);

//     return () => clearTimeout(timer); // cleanup
//   }, []); // run only once after initial render

//   function handler() {
//     setCount((prevCount) => prevCount + 1);
//     console.log("Count " + count);
//   }

//   return (
//     <>
//       Counter = {count}
//       <br />
//       <button onClick={handler}>Click Me</button>
//     </>
//   );
// }




// import { useEffect, useState } from "react";

// export default function Timer(){

//     const [count, setCount]= useState(0);
//     const [history, setHistory] = useState([]);
//     useEffect(() => {
//     setHistory((prevHistory) => [...prevHistory, count]);
//   }, [count]);

// function handler(){
// setCount((preCount)=>preCount+1)
// }
//     return(
//         <>
//         <h2>counter = {count}</h2>
//         <button onClick={handler}>click me</button>
        
//         <h3>count History</h3>
//         <table >
//              <thead><tr>
//                 <th>number</th>
//                 <th>count</th>
//             </tr></thead>
//             <tbody>
//                 {history.map((value, index)=>(
//                     <tr key={index}>
//                         <td>{index + 1}</td>
//                         <td>{value}</td>
//                     </tr>
//                 ))}
//             </tbody>
//         </table>
//         </>
//     );
// }


import { useState } from "react";

export default function TextToList() {
  const [input, setInput] = useState("");
  const [list, setList] = useState([]);

  // Triggered when input loses focus
  function handleBlur() {
    if (input.trim() !== "") {
      setList((prevList) => [...prevList, input.trim()]);
      setInput(""); // Clear input after adding
    }
  }

  return (
    <>
      <h2>Enter Item</h2>
      <input
        type="text"
        value={input}
        onChange={(e) => setInput(e.target.value)}
        onBlur={handleBlur}
        placeholder="Type something and click away"
      />

      <h3>Ordered List</h3>
      <ol>
        {list.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ol>
    </>
  );
}
