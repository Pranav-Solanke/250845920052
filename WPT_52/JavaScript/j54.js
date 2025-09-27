function generateTable()
{
    const num = parseInt(document.getElementById("numInput").value);
    const table = document.getElementById("tableOutput");
    table.innerHTML = "";

    // Check if the input is a valid number
    if (isNaN(num)) {
        table.innerHTML = "<tr><td>Please enter a valid number.</td></tr>";
        return; // Stop the function
    }

    // Add table headers
    const headerRow = table.insertRow();
    headerRow.innerHTML = "<th>Expression</th><th>Result</th>";

    for (let i = 1; i <= 10; i++) {
        const row = table.insertRow();
        row.insertCell(0).innerText = `${num} x ${i}`;
        row.insertCell(1).innerText = num * i;
    }
}