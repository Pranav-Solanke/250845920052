
let pattern5= /[a-z A-Z]+[0-9]{3}$/

var arr6= ['hellow123','1234567',
'678','re5tr34','rto09','row333','111rrrr444']

arr6.filter((element)=>
    {
        return element.match(pattern5)
    }).forEach((v)=>{console.log(v)})

// The pattern is let pattern5 = /[a-z A-Z]+[0-9]{3}$/. It dictates a specific format that a string must follow to be considered a match.

// Part	Meaning	Explanation
// [a-z A-Z]	Character Set	Matches any single lowercase letter (a through z), uppercase letter (A through Z), or a space character ( ).
// +	Quantifier	Means the preceding character set ([a-z A-Z]) must occur one or more times.
// [0-9]	Character Set	Matches any single digit (0 through 9). This is identical to using the shorthand \d.
// {3}	Quantifier	Means the preceding digit set ([0-9]) must occur exactly three times.
// $	Anchor	Matches the end of the input string. This ensures the three digits are the absolute last characters.