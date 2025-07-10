const quotes = [
    "I believe we are here on the planet Earth to live, grow up and do what we can to make this world a better place for all people to enjoy freedom.", 
    "Sometimes the most important thing in a whole day is the rest we take between two deep breaths",
    "Almost everything will work again if you unplug it for a few minutes, including you",
    "Knowing how to be solitary is central to the art of loving. When we can be alone, we can be with others without using them as a means of escape.",
    "Time you enjoy wasting is not wasted time.",
    "Self-care is how you take your power back",
    "When I’m not feeling my best I ask myself", 
    "What are you gonna do about it?” I use the negativity to fuel the transformation into a better me."

];
const colors = [
  "black",
  "darkslategray",
  "navy",
  "maroon",
  "darkgreen",
  "teal",
  "purple",
  "saddlebrown",
  "firebrick",
  "darkolivegreen"
];

function randomQuotes(){
    let num = parseInt(Math.random()*quotes.length);
    let color = colors[parseInt(Math.random()*colors.length)];
    document.getElementById("quote").innerText = quotes[num];
    quote.style.color = color;
}