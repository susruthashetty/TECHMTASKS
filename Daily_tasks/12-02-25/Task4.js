let side1 = 5;
let side2 = 6;
let side3 = 7;

let s = (side1 + side2 + side3) / 2;
let area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

console.log(`Area of the triangle: ${area}`);
