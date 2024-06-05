/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

var input = readline().split(' ');
let W = parseInt(input[0]); // width of the building.
let H = parseInt(input[1]); // height of the building.
let N = parseInt(readline()); // maximum number of turns before game over.
var inputs = readline().split(' ');
let x = parseInt(inputs[0]);
let y = parseInt(inputs[1]);

let x1 = 0;
let y1 = 0;
let x2 = W - 1;
let y2 = H - 1;

// game loop
while (true) {
    const bombDir = readline(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

    if (bombDir.includes("U")) {
      y2 = y - 1;
    } else if (bombDir.includes("D")) {
      y1 = y + 1;
    }

    if (bombDir.includes("L")) {
      x2 = x - 1;
    } else if (bombDir.includes("R")) {
      x1 = x + 1;
    }

    x = Math.round(x1 + (x2 - x1) / 2);
    y = Math.round(y1 + (y2 - y1) / 2);

    console.log(x + " " + y);
}
