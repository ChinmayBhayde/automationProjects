Feature: Applying for open position
Scenario: User checks job discription and applies to a job
Given user is at career discription page
When user confirms if job title is "Java Full Stack Developer"
And user confirms if job loacation is "Indianapolis, Indiana, United States of America"
And user confirms if job id is "2313292"
And user confirms if first sentence of third paragraph under Introduction as "We are seeking a Java full stack developer to be apart of our dynamic drug development team."
And user confirms if seventh job responsibility is "Execute system/software validation"
And user confirms if fourth Experience requirement is "3+ years of experience with Linux"
Then user clicks on apply now button
And redirects to MyWorkDay login page