1.	Rewrite (complete) Driver using “singleton” pattern. Are there any advantages?
Singleton driver provide us only one instance of driver avaliable at one moment. That provide us confidence, that we are working with the right driver.

2.	Suggest improvements for .properties reading. What are the purposes?
Purposes:
    avoiding hardcode values;
    separating properties provide us independence native and web tests from each other.

3.	Add checks of other fields and their titles (Contact Name, Contact phone) in “native” test
Added.

4.	Optional: Add keyboard presence check  in “native” test.
Not added.

5.	Which checks would you place in the “web” test?
Checking that main text fields are displayed in the home page, and contains the right information

6.	Implement checks for “web” test in code and try to use.
Implemented.