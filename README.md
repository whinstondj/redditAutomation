# redditAutomation
Here you will find and example of automation with Selenium, TestNg and Robot Framework


In folder "genome-automation" you will find the code created in eclipse for the challenge in selenium. Remember to install Java to run. 
All the Selenium Library is already in the folder.
To run with no problems, make sure to download the chromedriver and edith the path for System.setProperty in reddit.java file

In folder "genome-TestNgSelenium-automation" I created a second suite with testNG to generate automated reports.
I think that's the importance of automation. But it was not mentioned in the challenge, but I decided to create them.
All the Selenium and TestNG Library is already in the folder. However, you have to install the plugin in eclipse if you're using it
To run with no problems, make sure to download the chromedriver and edith the path for System.setProperty in reddit.java file

Finally, there is a third automation created in Robot Framework with SeleniumLibrary. Robot runs in Python, so you'll need to have it installed in your computer.
Also, install pip, and if you run these two simple commands, you're going to be able to run the code
command one: pip install robotframework
command two: pip install --upgrade robotframework-seleniumlibrary

and finally, make sure your chromedriver is in a path folder and set inside the folder and run the following command: "robot reddit-testCase.robot" in your terminal. 
That's enoguh to see Robot in action.

I decided to create this one to let you compare the tools and the ammount of lines of code you need to create in each one. Also the simplicity you could have in robot 
compare with Selenium. Howeveer. I have to admit there are a lot of documentation out there in Internet for selenium, so it could be a point for the tool.

Let me know if you need anything else
