# CS320ProjectOne
Project One for CS320 at SNHU

# Summarize the project and what problem it was solving.
  Overview
As you have learned in Modules One and Two, various types of software testing can be employed for a given situation. For this assignment, you will be creating unit tests using code to uncover errors for a mobile application. You will develop the contact service and contact object.

Prompt
For Project One, which is due in Module Six, you are asked to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code the application and provide unit tests to verify that the application meets the customer’s requirements. For this milestone, you will focus on delivering the contact services. The purpose of these services is to add, update, and delete contact objects within the application.

The contact service uses in-memory data structures to support storing contacts (no database required). In addition, there is no user interface for this milestone. You will verify the contact service through JUnit tests. The contact service contains a contact object along with the contact service. The requirements are outlined below.

Contact Class Requirements
The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
Contact Service Requirements
The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address
Guidelines for Submission
To complete this project, you must submit a Contact Service zipped folder containing the following deliverables:

Contact.java
ContactService.java
ContactTest.java
ContactServiceTest.java

# What did you do particularly well?
  This piece of the code sets the objects in a manner that is easily updatable by simple changing one instead of many variables.  The length variables may be updated independently of the objects themselves.
  
  	public class Contact {
		private static final int CONTACT_PHONENUM_LENGTH = 10;
		 private static final byte CONTACT_ID_LENGTH = 10;
		 private static final byte CONTACT_FNAME_LENGTH = 10;
		 private static final byte CONTACT_LNAME_LENGTH = 10;
		 private static final byte CONTACT_ADDRESS_LENGTH = 30;
		 private static final String INITIALIZER = "INITIAL";
		 private static final String INITIALIZER_NUM = "1235559999";
		 private String contactId;
		 private String firstName;
		 private String lastName;
		 private String phoneNumber;
		 private String address;

# Where could you enhance your code?  How would these improvements make your code more efficient, secure, etc?
  I could enhance this code by avoiding reduntant lines of code resulting in efficiency.

# Did you find writing any piece of this code challenging and how did you overcome this?  What tools and/or resources are you adding to your support network?
  To help me with this project, I used the provided texts from the CS320 course and used JUnit testing.

# What skills from this project will be particularly transferable to other projects and/or course work?
  I think I will use JUnit testing in all of my personal, work and academic endeavors.
  
# How can I ensure that my code, program, or software is functional and secure?
  Functional white box testing techniques were utilized to test the code in each of the milestones.  Testing assured that each string of data requested in the milestones met the specifications required, such as the length of the object.  For example the Contact specifications required the first name to not be null and not greater than 10 characters.  The code first checked within the constructor with conditional statements for the flow of specific inputs through the code:

if(firstName == null || firstName.length()>10) {
            throw new IllegalArgumentException("Invalid First Name");

 JUnit testing then provided white box testing with examples of the correct sample and an incorrect sample to test the expected output:
void testContactContactFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            new Contact("0123456789", "Troy Smith V", "Smith", "0123456789", "012345678910111213141516171819");
        });

Code coverage analysis is used to identify areas of the program that are not exercised by a set of test cases.  Statement Coverage is used to test each code statement to be tested at least once in the process, while branch coverage tests the paths or if-else and other conditional loops of the application.

# How do I interpret user needs and incorporate them into a program?
 Throughout this project while acting as a software tester, I employed caution to the extent of rereading the requirements of each assignment to be sure not to miss any detail and include all the necessary components.  For example, while creating the Contact requirements, I was cautious to be sure the Contact ID, first name, and last name were not null and no longer than 10 characters and that the phone number was not null and exactly 10 characters in length and that the address was not null and no longer than 30 characters.  

# How do I approach designing software?
As a software engineering professional, being disciplined in commitment to quality code is paramount.  This mandates that corners must not be cut and absolute concentration on minute details must be taken to prevent bugs or defects that may result in rework of the code.  Quality tests should be constructed to maintain code testing throughout the lifespan of the application to ensure further testing and grow the product without missing flaws.  This may be accomplished by researching the tests of others and learning from and improving upon their work in a collaborative and every growing mindset.  Technical debt will then be reduced as I move forward and learn from my peers and those who have traveled this path before me.
