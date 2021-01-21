#Java
Java is high level, compiled, strongly typed object-oritneted programming language.
-High-level: code that is easily human readable, as opposed to binary or assembly.
Hybrid betwen compiled and interpreted language: Human-readable code is **complied**, or transfromed, into a form more optimized for computer to read

 - For example. C++ code is compiled into binary
 - Java code on the other hand is compiled into Java byte-code, which the Java Virtual Machine(JVM) will then interpret this byte-code and essentially run the program.
 - Strongly-typed: variables declared of a certain type can only have values assigend to it of that same type
 -
 
##Benefits 
-Platform independent (write,once, run anywhere)
-C-language inspired syntax
-Automatic memory managemnet: accomplished with the help of a *garbage-collector*
- extensive built-in runtime library 
- Rich open-source communtiy 

#Jave 8 feartures
- Lambda expressions
- Method references
- functional interfaces
- stream API 
- Default method in interfaces
- Collectors class
- etc


#JVM, JRE and JDK
 in order to write and run Java, we need to have any understanding of JVM, JRE, and JDK. in particular, understanding these different components that make up the core ability to run and write Jave programs set a foundation for what is mean when we encounter all of these tersm whenever, for instance, We're installling java.

 JVm (Java Virtual Machine): Enables a computer to run Java programs. It esseentially behaves like an interpeter or just-in-time compile (JIT) which takes bytecode and translate it to something the computer can understand at an even lowere level then bytecode.
 - we have differen implementation of the JVM for different operating systems
 - Linux 
 - Windows 
 - Mac 
 - etc ..

     - The important thing to take away from this is that this allows you to run the same bytecode on any operating system (**Platform independece**)
- JRE (Java runtime environment): contain that JVM and runtime librarties that our code may be calling and using. If the only thing we need to do is run Java programs, all we need to install is the JRE.
- JDK ( Java Delevopment Kit): constains the JRE which of course contains the JVM + developer tools like the compiler (javac), debugger, documentation tools (javadoc), and other command-line utilities

if we want to both wrtie and run Jave programs, we should install JDK, If we only want to run Java programs and not write them(for exampleyour customers) we would install a JRE.

#Write Once run Anywhere( platform independence) 
Platfor indepence is estrablish by the JVM. we only need to compile the code once from source code into bytecode, which will then allow us to run our Java program on any operating system, any machine, as long as we have JVM compatiable 

#Java Date Types

At a high level, there are two main groups of data types. These are the follows
- Primitive data types
- Object reference data types

Primitive data types are the fundamental data types in Java that make up the building blocks for Object data types. We can have various states that are composed of either primitices or object references.


##Primites
- Four caterories of primities:
   - Intergers types(intergal tyeps)
     - ex. 10 ,11, etc
  - Floatin point types  (decimal numbers)
     -ex. 10.999, 10.998 , etc..
  - character type 
     - represent a single character
     - ex. 'c'
  -boolean type 
     - represent a true/falce value 
- importanr propeprty: stored by value 


Java is passed by value, unlinke some other programming languages.

---
**Integerlal types**
|Type | BIts | min Value | Max value | literal form|
| :-- | :--  | :-------- | :-------  | :---------- |
|byte | 8 bits | -128 | 127| 0 |
|short | 16-bits | -32768 | 32767| 0|
|int | 32-bits | -2,147,483,648 | 2,147,483,647| 0|
|long | 64-bits | -9,223,373,036,854,775,808 | 9,223,036,854,775,807| 0L|

---
**Floating Point types**
|Type | BIts | min Value | Max value | literal form|
| :-- | :--  | :-------- | :-------  | :---------- |
|float | 32 bits | -1.4 *10^ 45 |3.4 *10 ^38 | 0.0f |
|double | 64-bits | 4.9* 10^324 | 1.7* 10^308 | 0.0 |

---
**Character types**
- Stores a single unicode character 
- Literal values can be place "'c'" and "'C'"
- for unicode points, use \u followed by the 4-digit hex value 
- can store positive number 0 -> 65535

---
**Boolean types**
- store true/false 
- Literal value are **true** and **false**
 Maybe to rember primitives, go in this order: byte -> short -> char-> int -> long -> float -> double and boolean 

##Object Reference Types
- object reference types are the ohter category of data types besides primitives. They are used to refer to objects
- In particular, they do not store the object itself. They contain an address(or link) to this object that is somewhere else in memory
  -Unlike primitives, whcih do store the value itsel
  -think of a referenece type as a variable holding information on where an object that particular type (as defined by the class, which you can think of a blueprint) is located

# Java Classes and objects
- Jave has the idea of **Class** and **Objects** built into the language
  - Object represent real-world or conceptual entites
     - object had **members**, which are composed of two types:
       - State: (also known as fileds or instance variables)
       - Behavior: (also known as instance methods)



# Casting 
  In Javs, at a high level, we essentially have two forms of casting:
  - Explicit casting
  - Implicit casting 

Casting can be perfomred on both primitive and reference data types. For primitives, this is known as primitive conversion, and for reference variables, it is know generally as casting.

In both cases, we "turn" one type into another, but the differenence between primitive converson and reference type casting is quite different. The difference mainly stems form the fact that primimtive variable contains a value, which result in actual changes in its' value.

## Primitivie variables Casting 
Primitve casiting is known as type conversion. This allows us to change the value form one data type to another. Implicit casting occurs if we go from a primitive type that is **smaller** in ragne to one that **larger** in range, in techniacl terms, implict casting occurs when the casting operation is "safe", while explicit casting is necessary if it is unsafe (in cases where you can lost data).

- Widening Conversion 
  -Occures implicitily
  -byte ->short -> char -> int -> long -> float -> double 
  - Notive how long fits inside float, despite long being 64 bit and float beign 32 bit.. becuase of how the ranges are represented 
- Narrowing conversion
  - Occurs explictly 
  - Care should be taken 
  - double -> float ->long ->int ->char ->short ->byte

## Reference Variable casting 
Reference variable casting occurs when we convert form reference type to antoher. In the case of reference varialbe casting, implicit casting occures if we form a child class type up to a parent class type, which is "Safe" operation. Explicit casting occurs 
