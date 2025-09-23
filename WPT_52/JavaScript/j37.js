//2) Write a Program to use Different Array Library Functions using switch case
function arrayOperations(choice) {
    let arr = [10, 20, 30, 40, 50];

    switch (choice) {
        case "PUSH":
            arr.push(60);
            console.log("After push:", arr);
            break;

        case "POP":
            arr.pop();
            console.log("After pop:", arr);
            break;

        case "SHIFT":
            arr.shift();
            console.log("After shift:", arr);
            break;

        case "UNSHIFT":
            arr.unshift(5);
            console.log("After unshift:", arr);
            break;

        case "SORT":
            arr.sort((a, b) => a - b);
            console.log("After sort:", arr);
            break;

        case "REVERSE":
            arr.reverse();
            console.log("After reverse:", arr);
            break;

        case "SLICE":
            let sliced = arr.slice(1, 3);
            console.log("After slice(1,3):", sliced);
            break;

        case "SPLICE":
            arr.splice(2, 1, 99); // remove 1 element at index 2, insert 99
            console.log("After splice:", arr);
            break;

        case "JOIN":
            let joined = arr.join("-");
            console.log("After join:", joined);
            break;

        case "MAP":
            let doubled = arr.map(x => x * 2);
            console.log("After map (x*2):", doubled);
            break;

        default:
            console.log("Invalid choice");
    }
}

// ------------------ Testing ------------------
arrayOperations("PUSH");
arrayOperations("POP");
arrayOperations("SHIFT");
arrayOperations("UNSHIFT");
arrayOperations("SORT");
arrayOperations("REVERSE");
arrayOperations("SLICE");
arrayOperations("SPLICE");
arrayOperations("JOIN");
arrayOperations("MAP");
