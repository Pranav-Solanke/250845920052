import React, {useState} from 'react';
export default function DatatableLoader(){
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(false);
  const fetchData = async ()=>{
    setLoading(true);
     try {
      const response = await fetch('https://jsonplaceholder.typicode.com/users');
      const jsonData = await response.json();
      setData(jsonData);
    } catch (error) {
      console.error('Error loading data:', error);
    } finally {
      setLoading(false);
    }
  };

    return(      
        <div>
            <h2>User Data Table</h2>
            
            <button onClick={fetchData}>Load DatatableLoader</button>
            {loading && <p> Loading...</p>}
            {data.length>0 && <DataTable data={data} />}
        </div>
    );}

    function DataTable({data}){
    return(
    <table  border="1" cellPadding="8">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
               <th>City</th>            
            </tr>
        </thead>
        <tbody>
            {/* key is unique to each entry so and id is unique for each entry so thats why key=id */}
            {data.map(user=>(
                <tr key={user.id}>
                    <td>{user.name}</td>
                    <td>{user.email}</td>
                    <td>{user.address.city}</td>
                </tr>

            ))
            }
        </tbody>
    </table>
);
}

