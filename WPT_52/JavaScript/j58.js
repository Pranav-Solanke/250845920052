

let emailpattern = /[a-zA-Z -_]+@[a-z A-z]+\.[a-z A-Z]{2,3}$/
var arr7= ['---@aaa.com','pra@gmail.org',
'pra_g@hotmail.com','pra@hotmail','pra__gre@ggg.vvv',
"test@gov.in"]

arr7.filter((element)=>{
    return element.match(emailpattern)
}).forEach((element)=>{console.log(element)})

// The pattern is let emailpattern = /[a-zA-Z -_]+@[a-z A-z]+\.[a-z A-Z]{2,3}$/. It attempts to match a string that generally resembles an email address.

// Part	Description	Required Match
// [a-zA-Z -_]+	Local Part (Username)	One or more (+) letters (upper/lower), spaces, hyphens (-), or underscores (_). The inclusion of spaces is unusual for a strict email regex.
// @	At Symbol	The literal @ character.
// [a-z A-z]+	Domain Name	One or more letters (upper/lower) or spaces. Again, spaces are unusual for a domain name.
// \.	Literal Dot	The literal dot (.) character. The backslash (\) is necessary to escape the dot, as . normally means "any character."
// [a-z A-Z]{2,3}	Top-Level Domain (TLD)	2 or 3 letters (upper/lower) or spaces.
// $	End Anchor	Matches the end of the string. This ensures the pattern matches the entire element.