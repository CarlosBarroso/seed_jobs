# seed_jobs

https://www.digitalocean.com/community/tutorials/how-to-automate-jenkins-job-configuration-using-job-dsl

Create a Seed Job that Pulls your DSL

From the top navigation menu of Jenkins, select Jenkins > New Item

Give the project a name. For example, we entered Seed Job.

Select the Freestyle project option.

Under Source Code Management of the job configuration page, select Git and then fill in the required information.

Under Build of the job configuration page, click Add build step and then select Process Job DSLs.

Ensure Look on Filesystem is selected under Build.

In the DSL Scripts text field, enter the name of the groovy file you want to use. If you have a collection of DSLs organized in directories, you can enter **/*.groovy to run all DSL files.

Click Save at the bottom of the job configuration page.

Build your seed project to pull the DSL files and create your jobs.

