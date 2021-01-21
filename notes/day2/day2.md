# Java: Operators
Operators in Java allow to perform operatons with our primimitves. In Java we have different categories of operators
- Arithmetic operators (adding, subtracting, dividing, multiplying etc.)
- Logical Operators  (true/false boolean, &&, ||, ~, *(AND, OR ,NOT...))
- Assignment Operators (=, *=, /=, ....)
- RELATION Operators (comparison operators)
- Bitwise Operators

## Arithmetic Operaotrs
Arithmetic operarots perfrom common mathematical operatuibs
| Operator | Name | Description | Example |
| :------- | :--- | :---------- | :------ :
+ |

- Operator Precedence(from highest to lowets
  - Prefix (++x or --x)
  - Postfix(x++ or x--)
  - Multiplication( *, /, % <-modulo Operators)
  - Additive
  - Gernerally follows PEMDAS

| Operator | Name | Description | Example |
| :------- | :--- | :---------- | :------ |
| &&  | Logical ANd | Evalutes to true if both statments are true| x >10 && x < 20 |
| \|\| | Logial OR | Evalutes to true ifd at least one of the statements os true | x <10 \|\| x > 20 |
|!| Logical Not | Evakutes to false if the resutl is true and vice versa| !(x << 5)|

## Assignment Operators

 
| Operator | Name | Description | Example |
| :------- | :--- | :---------- | :------ |
| = | x = 3 | x =3 |
| += | x+=3 | x = x +3|
|-+ | x -=3 | x= x-3 |
|*= | x *= 3| x=x *3|
|/=| x/=3 |x =x/3|
|%=|x%=3| x = x % 3|

Relational Operators 


| Operator | Name | Example |
| :------- | :--- | :------ |
| == | Equal to | x == y  |
|!= | not equal to | x != y|
|> | Greater then | x > y|
| < |Less than | x < y|
|>= | greater then or eqaul to | x >= y|
| <= | less then or equal to | x <= y|
|instaceof |object comparison | myobj instanceof String |


##Bitwase Operators

| Operator | Description | Example | Same as | Result | decimal | 
| :------- | :---------- | :------ | :------ | :----- | :------ |
| & | AND -  S et corresponding bit to 1 if both bits are 1| 5 & 1 | 0101 & 0001} 0001 | 1 |
| \| | OR -Sets each bit to 1 if any of the two bits is 1 | 5 \| 1| 0101 \| 0001 | 0101 | 5 |
| ~ | NOT - switches bit to the inverser | ~5 | 0101 | 1010 | 10 |
| ^ | XOR - Set a bit to 1 if one and only 1 of the bits is |5 ^1| 0101 ^ 0001 | 0100 | 4
| << | Zero-fill left shit - Shits bit left, pushesd in zero for the right and let leftmost bits fall off | 9 << 1 | 1001 << 0001 | 0010 | 2|
|>>> | Signed right  |
