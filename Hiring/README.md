# We Are Hiring
Finahub is hiring engineers and we look at the work first and resumes later. 
We don't care about the degrees you have or the college you come from. We care about the quality of work you can do.

## Instructions
**Step 1:** Fork [PlayGround Repository](https://github.com/Finahub/PlayGround)
 
 **Step 2:** Add your project as a folder in [Hiring folder of this repository](https://github.com/Finahub/PlayGround/tree/main/Hiring) 
 
 **Step 3:** Add your code to the folder as per the task given below.
 
 **Step 4:** Submit a pull request 

## Your Task

Create a small web application that has the following component
1. Server side component written in Java that expose 2 REST API's
    1. Create a GET API that will fetch the data from AirTable base named [Bank Info](https://airtable.com/shrLW24i9g40XV9Ab) and return any one row of the data as a JSON. If you do not have Airtable account then please use this [invite link to sign in and get access to Bank  Info Base](https://airtable.com/invite/l?inviteId=invdd9vtsjikYkFym&inviteToken=f352ba8e45be5663a75f76d4e51ef3da6cb7407d5cb3a6a98cf849b09a422ad5). For the GET API and API Token needed to make the call refer to [AirTable Documentation](https://airtable.com/api)
    2. Create a POST API that will insert the JSON data argument into an in-memory database such as [H2](http://www.h2database.com/html/main.html), [Apache Derby](https://db.apache.org/derby/) or [HSQLDB](http://hsqldb.org/)

2. Client side component
    1. An HTML page that use Angular (**or any other client side technology you are familiar with**) to fetch data and display it by calling a the above mentioned GET API. The API should be invoked when a button on the page is clicked. The data should be displayed in tabular form.
    2. There should be a submit button below the data table which when clicked should call the POST API mentioned above to save the data.

### Pull Request
Please make sure that you submit pull request with a working code. 
If we accept the code, we will call you for a technical interview.

## Questions
If you have any questions or doubts, feel free to get in touch with us at hr@finahub.com


in Angular side , need to install dependencies like npm i only and URL is => http://localhost:4200/BankInfo
