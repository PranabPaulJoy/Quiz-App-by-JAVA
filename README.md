# Quiz-App-by-JAVA

## Project Brief
This is a **Quiz test** program. Here will be an admin and a student. A login system will take input the user name and password from the user and then will check if is it an admin 
or a student. When an admin will log in with admin credits, the admin will be able to create quiz questions, right answers and add them data file also. 
After creating a question the program will ask to the admin that do you want to create another question? If admin agree then  admin has to be press 's', if not then admin has 
to be press 'q'. On the otherhand, when a student will log in with student credits then the program will ask to the student do you ready to give quiz test? If yes then press 
's'. If student agree then student has to be press 's' the quiz test will start, if not if the student press any other characters program will display a message 
"You are not ready to give quiz test" and then program will terminated. If student wants to give test again then again student has to press 's'. 
Whenever students press any other characters or 'q' except 's' prgram will be terminated.

## What is JAVA
**Java is a popular high-level, class-based object-oriented programming language originally developed by Sun Microsystems and released in 1995.**

## Why Java is needed
**Java** is a widely-used programming language for coding web applications. It has been a popular choice among developers for 
over two decades, with millions of Java applications in use today. Java is a multi-platform, object-oriented, and network-centric 
the language that can be used as a platform in itself. It is a fast, secure, reliable programming language for coding everything from 
mobile apps and enterprise software to big data applications and server-side technologies.

## What is JSON
**JSON** (JavaScript Object Notation) is a lightweight data-interchange format. It is easy for humans to read and write. It is easy for machines to parse and generate. 
It is based on a subset of the JavaScript Programming Language Standard ECMA-262 3rd Edition - December 1999. JSON is a text format that is completely language independent 
but uses conventions that are familiar to programmers of the C-family of languages, including C, C++, C#, Java, JavaScript, Perl, Python, and many others.

**JSON Data Format**

[

{

    "question": "Which is functional testing?",
    
    "Input option 1: ": "Load Testing"
    
    "Input option 2: ": "Security Testing",
    
    "Input option 3: ": "Gorila Testing",
    
     "Input option 4: ": "Benchmark Testing",        
    
    "AnswerKey": "3",
        
  },
  
  {     
  
    "question": "Which is not static testing?",
    
    "Input option 1: ": "walkthrough"
    
    "Input option 2: ": "exploratory",
    
    "Input option 3: ": "peer review",
    
    "Input option 4: ": "inspection",        
    
    "AnswerKey": "2",  
  }
  
]

## Technology Used
- IntelliJ
- Java
- Gradle

## How to Run
 - clone this project
 - execute with IntelliJ

## Scenario
**From Admin perspective**

System:> Enter your username

User:> admin

System:> Enter password

User:> 1234

System:> Welcome admin! Please create new questions in the question bank.

System:> Input your question

Admin:> Which is not part of system testing?

System: Input option 1:

Admin: Regression Testing

System: Input option 2:

Admin: Sanity Testing

System: Input option 3:

Admin: Load Testing

System: Input option 4:

Admin: Unit Testing

System: What is the answer key?

Admin: 4

System:> Saved successfully! Do you want to add more questions? (press s for start and q for quit)

**From Student perspective**

System:> Enter your username

User:> pranab

System:> Enter password

User:> 1234

System:> Welcome pranab to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.

Student:> s
System:> 

[Question 1] Which is not part of system testing?

1. Regression Testing

2. Sanity Testing

3. Load Testing

4. Unit Testing

Student:> 4

[Question 2] Which is whitebox testing technique?

1.Equivalent Partitioning

2. Boundary value testing

3. Decision table testing

4. Adhoc Testing


Student:> 3

**For an example output:**

if mark is above 8>= message: **Excellent! You have got [marks] out of 10**

if mark is above 5>= but less than 8, message: **Good. You have got [marks] out of 10**

if mark is above 2>= but less than 5, message: **Very poor! You have got [marks] out of 10**

if mark is 0 or less than 2 message: **Very sorry you are failed. You have got [marks] out of 10**

Would you like to start again? press s for start or q for quit

## Project Video

https://github.com/PranabPaulJoy/Quiz-App-by-JAVA/assets/127541697/26fe72a7-7577-4a1e-a441-b5a6aba760a6



