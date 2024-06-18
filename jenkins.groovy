
def call (string stagename)
{
if ("${stageName}" == "Build")
{
sh "mvn clean Package"
}
else if ("${stageName}" == "sonarQube Report")
{
sh "mvn clean sonar:sonar"
}
else if ("${stageName}" == "upload into Nexus")
{
sh "mvn clean deploy"
}
}
