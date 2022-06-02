//edit cube as fit
public class Cube {
    //makes new cube
    String key[][] = { 
    { "[0][0]", "[0][1]", "[0][2]"},
    { "[1][0]", "[1][1]", "[1][2]"},
    { "[2][0]", "[2][1]", "[2][2]"} };
    char F[][] = { 
        { 'W', 'W', 'R'},
        { 'R', 'G', 'G'},
        { 'R', 'Y', 'Y'} };
        char L[][] = { 
        { 'W', 'R', 'G'},
        { 'R', 'O', 'B'},
        { 'R', 'Y', 'Y'} };
        char R[][] = { 
        { 'G', 'G', 'Y'},
        { 'O', 'R', 'B'},
        { 'B', 'R', 'R'} };
        char D[][] = { 
        { 'B', 'O', 'O'},
        { 'B', 'Y', 'Y'},
        { 'W', 'W', 'W'} };
        char U[][] = { 
        { 'B', 'O', 'O'},
        { 'G', 'W', 'Y'},
        { 'O', 'G', 'Y'} };
        char B[][] = { 
        { 'G', 'W', 'O'},
        { 'O', 'B', 'W'},
        { 'G', 'B', 'B'} };
}

// if you want to randomize uncomment 
// public class Cube {
//     //makes new cube
//     String key[][] = { 
//     { "[0][0]", "[0][1]", "[0][2]"},
//     { "[1][0]", "[1][1]", "[1][2]"},
//     { "[2][0]", "[2][1]", "[2][2]"} };
//     char F[][] = { 
//     { 'G', 'G', 'G'},
//     { 'G', 'G', 'G'},
//     { 'G', 'G', 'G'} };
//     char L[][] = { 
//     { 'O', 'O', 'O'},
//     { 'O', 'O', 'O'},
//     { 'O', 'O', 'O'} };
//     char R[][] = { 
//     { 'R', 'R', 'R'},
//     { 'R', 'R', 'R'},
//     { 'R', 'R', 'R'} };
//     char D[][] = { 
//     { 'Y', 'Y', 'Y'},
//     { 'Y', 'Y', 'Y'},
//     { 'Y', 'Y', 'Y'} };
//     char U[][] = { 
//     { 'W', 'W', 'W'},
//     { 'W', 'W', 'W'},
//     { 'W', 'W', 'W'} };
//     char B[][] = { 
//     { 'B', 'B', 'B'},
//     { 'B', 'B', 'B'},
//     { 'B', 'B', 'B'} };
// }

