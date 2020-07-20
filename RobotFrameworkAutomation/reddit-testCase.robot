*** Settings ***
Documentation    This is a simple code to verify a UI in Reddit
Library         SeleniumLibrary

*** Variables ***
${browser}          Chrome
${website}          https://www.reddit.com/
${screenShoots}     /Users/winstoncastillo/Documents/automationChallenge/RobotFrameworkAutomation/screenShootsSelenium

*** Test Cases ***
001 Visiting The site to Verify Functionality
    [Tags]    FunctionalTest
    Set Screenshot Directory if Fail
    ${options}=    Evaluate  sys.modules['selenium.webdriver.chrome.options'].Options()    sys
    Call Method     ${options}    add_argument    --disable-notifications
    ${driver}=    Create Webdriver    Chrome    options=${options}
    Go To        ${website}
    Wait Until Element is Visible       xpath=//*[@id="USER_DROPDOWN_ID"]/span[1]/span
    ${homePageTitle}=           Get Title
    Click Element          xpath=//*[@id="USER_DROPDOWN_ID"]/span[1]/span
    Set Focus To Element          class=_3m4MQxMy4WfgIkMhHh-UAg
    Click Element         class=_3m4MQxMy4WfgIkMhHh-UAg
    Input Text          id=header-search-bar        Testing Concepts
    Click Element       id=header-search-bar
    Wait Until Element is Visible       partial link=TestingConcepts
    ${newURLOpen}=      Get Element Attribute          partial link=TestingConcepts      href
    Execute Javascript      window.open()
    Switch Window	locator=NEW
    Go To           ${newURLOpen}
    Wait Until Element is Visible     class=_30BbATRhFv3V83DHNDjJAO
    Click Element          class=_30BbATRhFv3V83DHNDjJAO
    Title Should Be         ${homePageTitle}
    Click Element          xpath=//*[@id="USER_DROPDOWN_ID"]/span[1]/span
    Click Element         class=_3m4MQxMy4WfgIkMhHh-UAg
    Close Browser

*** Keywords ***
Set Screenshot Directory if Fail
        Set Screenshot Directory   ${screenShoots}
