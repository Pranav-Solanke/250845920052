import logo from './logo.svg';
import Counter from './component/Counter.js'
import './App.css';
import Weather from './component/wheather.js'
import DataTable from './component/dataTableLoader.js'
import Password from './component/pass.js'
import NewPassword from './newComp/passwordGen.js'
import NewCallBackPass from './callbackPasswordGen/passGenWithCallback.js'
import Counter1 from './counterForErrorBoundry/countermain.js'
function App() {
  return (<>
     
      {/* <DataTable></DataTable> */}
 {/* <NewCallBackPass></NewCallBackPass> */}
            {/* <Password></Password> */}
            <Counter1></Counter1>
            
            {/* <NewPassword></NewPassword> */}
            </>
            // <Weather></Weather>
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
            // { <Counter></Counter> }
          
       /* { <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> }*/
    //   </header>
    // </div>
   );
}

export default App;
