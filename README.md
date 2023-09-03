# RegExpGpt
RegExp Project with Help of ChatGPT 4

1. Application Description:
The Android application offers a platform to validate strings against specific criteria. 
By inputting a string and defining a maximum length, users can easily ascertain whether the string meets the set requirements. 
These include containing both uppercase and lowercase letters, digits, special characters, and not having any whitespace characters.

2. Regex Implementation Description:
At the heart of this application is a regular expression designed for string validation. 
The regex first checks if the string length remains within the defined limit. 
Following this, it validates the existence of at least one uppercase letter, one lowercase letter, one digit, and one special character from a predefined list. 
It also ensures the string is free of whitespace characters. 
The design of this regex gives priority to both speed and simplicity, ensuring reliable validation based on the provided criteria.

3. How to Open and Run Project Tests Locally:

How to Open and Run Project Tests Locally:

Prerequisites: Make sure Android Studio is installed. If not, download and install it from the official website.
Open the Project:
Start Android Studio.
Choose 'Open an Existing Android Studio Project'.
Browse to the directory with the project files (MainActivity.kt, StringValidator.kt) and select the project root directory.
Click 'Open'.
Run Tests:
In the 'Project' pane on the left, navigate to the "test" directory.
Find the StringValidatorTest.kt file within this directory.
Right-click on the file.
Choose 'Run 'StringValidatorTest''.
The results will appear in the 'Run' window after Android Studio completes the test execution.