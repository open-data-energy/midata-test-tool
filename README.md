#midata-test-tool

* Test Grails App to help you get started with the First Utility Midata API

#### Pre Requisites
Java 1.6
- with JAVA_HOME set to point to your installation
N.B. There is a problem with Java 7's SSL implementation which causes the App to fail, so don't use :)

Groovy 2.2.2 http://groovy.codehaus.org/Download
- with GRAILS_HOME set to point to your installation

Add JAVA_HOME/bin and GRAILS_HOME/bin to your PATH


After you have installed the pre requisite components, clone this Bitbucket repository.

#### Running the application
change directory to your midata-test-tool directory
at prompt type: grails run-app
- this will start the application and it will listen on port 8080.

In a browser paste: http://localhost:8080/midata-test-tool
- this will load the welcome page. You should be able to use the site by yourself from here onwards!

#### OAuth information
The Midata OAuth service uses the 'Implicit Grant Flow' (http://tools.ietf.org/html/rfc6749#section-4.2).

The Access Token is delivered to the client by appending it with a hash to the Redirect URI. The use of a hash fragment means that some servers are unable to directly access the token.

Midata-test-tool includes some JavaScript (oauth.js) which captures the Access Token by parsing the redirect uri.

It then inserts the Access Token into a hidden field on a form which is then POSTed onto the application.

The application uses this Access Token to access the Supply Details resource.

#### OAuth configuration
DataSource.groovy - This contains the configuration for accessing the Midata API. See: 
 
environments.development.oauth.clientId - Application's Client ID.

environments.development.oauth.redirectUri - URI to where Client will be redirected.

environments.development.oauth.scope - Scope of the request set Supply_Details.
